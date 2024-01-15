package com.example.koreancraftartbox2

import android.content.Intent
import android.graphics.Bitmap
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content111.videoImageView1
import kotlinx.android.synthetic.main.fragment_content211.*
import kotlinx.android.synthetic.main.fragment_content211.view.myScrollView

class Content211Fragment : Fragment() {
    companion object {
        private const val VIDEO_ACTIVITY_REQUEST_CODE = 100
        private const val FRAME_RATE = 60
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private fun extractFrameFromVideo(videoUri: Uri, frameNumber: Int): Bitmap? {
        val mediaMetadataRetriever = MediaMetadataRetriever()
        mediaMetadataRetriever.setDataSource(requireActivity(), videoUri)
        val frameTimeMicros = frameNumber * 1000000L / FRAME_RATE
        return mediaMetadataRetriever.getFrameAtTime(frameTimeMicros)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_content211, container, false)
        view.rootView.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
            }
            false
        }
        view.myScrollView.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
            }
            false
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rightButton.setOnClickListener { replaceWithSecondFragment()
            CustomToast.cancelToast() }
        val videoImageViews = listOf(videoImageView1)
        val videoResources = listOf(R.raw.video9)

        for (i in videoImageViews.indices) {
            val videoUri = Uri.parse("android.resource://${requireContext().packageName}/${videoResources[i]}")
            videoImageViews[i].setImageBitmap(extractFrameFromVideo(videoUri, 300))

            videoImageViews[i].setOnClickListener {
                val intent = Intent(requireActivity(), VideoFullScreenActivity::class.java)
                intent.data = videoUri
                startActivityForResult(intent, Content211Fragment.VIDEO_ACTIVITY_REQUEST_CODE)
            }
        }
    }

    private fun replaceWithSecondFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.detail_content_frame2, Content212Fragment())
            .addToBackStack(null)
            .commit()
    }
}
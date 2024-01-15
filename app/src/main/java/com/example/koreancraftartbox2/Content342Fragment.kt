package com.example.koreancraftartbox2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content342.*

class Content342Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_content342, container, false)
        view.rootView.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
            }
            false
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        leftButton.setOnClickListener { replaceWithSecondFragment()
            CustomToast.cancelToast() }
        content1.setOnClickListener {
            val intent = Intent(requireActivity(), ContentDetailActivity341::class.java)

            val handler = Handler(Looper.getMainLooper())
            val delayMillis: Long = 300
            handler.postDelayed({
                startActivity(intent)
            }, delayMillis)
        }
        content2.setOnClickListener {
            val intent = Intent(requireActivity(), ContentDetailActivity342::class.java)

            val handler = Handler(Looper.getMainLooper())
            val delayMillis: Long = 300
            handler.postDelayed({
                startActivity(intent)
            }, delayMillis)
        }
        content3.setOnClickListener {
            val intent = Intent(requireActivity(), ContentDetailActivity343::class.java)

            val handler = Handler(Looper.getMainLooper())
            val delayMillis: Long = 300
            handler.postDelayed({
                startActivity(intent)
            }, delayMillis)
        }
        content4.setOnClickListener {
            val intent = Intent(requireActivity(), ContentDetailActivity344::class.java)

            val handler = Handler(Looper.getMainLooper())
            val delayMillis: Long = 300
            handler.postDelayed({
                startActivity(intent)
            }, delayMillis)
        }
        content5.setOnClickListener {
            val intent = Intent(requireActivity(), ContentDetailActivity345::class.java)

            val handler = Handler(Looper.getMainLooper())
            val delayMillis: Long = 300
            handler.postDelayed({
                startActivity(intent)
            }, delayMillis)
        }
        content6.setOnClickListener {
            val intent = Intent(requireActivity(), ContentDetailActivity346::class.java)

            val handler = Handler(Looper.getMainLooper())
            val delayMillis: Long = 300
            handler.postDelayed({
                startActivity(intent)
            }, delayMillis)
        }
    }

    private fun replaceWithSecondFragment() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.detail_content_frame3, Content341Fragment())
            .addToBackStack(null)
            .commit()
    }
}
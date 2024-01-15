package com.example.koreancraftartbox2

import android.graphics.Bitmap
import android.media.MediaMetadataRetriever
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_content_detail31.tab_layout
import kotlinx.android.synthetic.main.activity_content_detail33.*

class ContentDetailActivity33 : BaseActivity() {

    private fun setIndicatorView(imageList: ArrayList<Int>) {
        if (imageList.size > 1) {
            tab_layout.visibility = View.VISIBLE
            tab_layout.setupWithViewPager(viewPager)
            tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab) {
                    viewPager.setCurrentItem(tab.position, true)
                }

                override fun onTabUnselected(tab: TabLayout.Tab) {}
                override fun onTabReselected(tab: TabLayout.Tab) {}
            })
            val delayMillis = 3000L // 이미지 전환 간격 (밀리초)
            val handler = Handler(Looper.getMainLooper())
            val runnable = object : Runnable {
                override fun run() {
                    val currentItem = viewPager.currentItem
                    val nextItem = if (currentItem == imageList.size - 1) 0 else currentItem + 1
                    viewPager.setCurrentItem(nextItem, true)
                    handler.postDelayed(this, delayMillis) // Runnable을 다시 postDelayed로 반복 실행
                }
            }
            handler.postDelayed(runnable, delayMillis) // 최초 실행
        }
    }

    private fun getDetailInfoMap(uri: Uri): MutableMap<String, Any> {
        val map: MutableMap<String, Any> = mutableMapOf()

        val queryParameterNames = uri.queryParameterNames
        for (key in queryParameterNames) {
            val value = uri.getQueryParameter(key)
            if (value != null) {
                val convertedValue: Any = convertToAppropriateType(value)
                map[key] = convertedValue
            }
        }
        return map
    }


    private fun extractFrameFromVideo(videoUri: Uri, frameNumber: Int): Bitmap? {
        val mediaMetadataRetriever = MediaMetadataRetriever()
        mediaMetadataRetriever.setDataSource(this, videoUri)
        val frameTimeMicros = frameNumber * 1000000L / 60
        return mediaMetadataRetriever.getFrameAtTime(frameTimeMicros)
    }

    private fun setDetailInfo(map: MutableMap<String, Any>) {
        mainTitle.text = map["title"].toString()
        subTitle.text = map["subTitle"].toString()
        detail_title.text = map["title"].toString()
        detail_manufacturer.text = map["manufacturer"].toString()
        detail_writer.text = map["writer"].toString()
        detail_company.text = map["company"].toString()
        detail_specification.text = map["specification"].toString()
        detail_texture.text = map["texture"].toString()
        summary.text = map["summary"].toString()
        basic1.text = map["basic1"].toString()
        basic2.text = map["basic2"].toString()
        reference.text = map["reference"].toString()
    }
    override fun onDestroy() {
        super.onDestroy()
        CustomToast.cancelToast()
        Glide.get(this).clearMemory()
    }
    data class basicImageInfo(val imageId: Int, val text: String, val width: Int, val height: Int)
    private fun getBasicImage(index: Int):  basicImageInfo? {
        return when (index) {
            0 -> basicImageInfo(R.drawable.detail_3_3_1, "전복 구조", 744, 632)
            1 -> basicImageInfo(R.drawable.detail_3_3_1, "전복 구조", 744, 632)
            2 -> basicImageInfo(R.drawable.detail_3_3_1, "전복 구조", 744, 632)
            3 -> basicImageInfo(R.drawable.detail_3_3_1, "전복 구조", 744, 632)
            4 -> basicImageInfo(R.drawable.detail_3_3_1, "전복 구조", 744, 632)
            5 -> basicImageInfo(R.drawable.detail_3_3_1, "전복 구조", 744, 632)
            6 -> basicImageInfo(R.drawable.detail_3_3_1, "전복 구조", 744, 632)
            7 -> basicImageInfo(R.drawable.detail_3_3_2, "소라 구조", 744, 632)
            8 -> basicImageInfo(R.drawable.detail_3_3_2, "소라 구조", 744, 632)
            9 -> basicImageInfo(R.drawable.detail_3_3_2, "소라 구조", 744, 632)
            10 -> basicImageInfo(R.drawable.detail_3_3_3, "조개 구조", 744, 632)
            11 -> basicImageInfo(R.drawable.detail_3_3_3, "조개 구조", 744, 632)
            12 -> basicImageInfo(R.drawable.detail_3_3_3, "조개 구조", 744, 632)
            13 -> basicImageInfo(R.drawable.detail_3_3_3, "조개 구조", 744, 632)
            else -> null
        }
    }

    private fun getImageList(index: Int):  ArrayList<Int> {
        val imageList = ArrayList<Int>()
        when (index) {
            0 -> {
                imageList.add(R.drawable.detail_3_3_4)
                imageList.add(R.drawable.detail_3_3_5)
            }
            1 -> {
                imageList.add(R.drawable.detail_3_3_6)
                imageList.add(R.drawable.detail_3_3_7)
            }
            2 -> {
                imageList.add(R.drawable.detail_3_3_8)
                imageList.add(R.drawable.detail_3_3_9)
            }
            3 -> {
                imageList.add(R.drawable.detail_3_3_10)
                imageList.add(R.drawable.detail_3_3_11)
            }
            4 -> {
                imageList.add(R.drawable.detail_3_3_12)
                imageList.add(R.drawable.detail_3_3_13)
            }
            5 -> {
                imageList.add(R.drawable.detail_3_3_14)
                imageList.add(R.drawable.detail_3_3_15)
            }
            6 -> {
                imageList.add(R.drawable.detail_3_3_16)
                imageList.add(R.drawable.detail_3_3_17)
            }
            7 -> {
                imageList.add(R.drawable.detail_3_3_18)
                imageList.add(R.drawable.detail_3_3_19)
            }
            8 -> {
                imageList.add(R.drawable.detail_3_3_20)
                imageList.add(R.drawable.detail_3_3_21)
            }
            9 -> {
                imageList.add(R.drawable.detail_3_3_22)
                imageList.add(R.drawable.detail_3_3_23)
            }
            10 -> {
                imageList.add(R.drawable.detail_3_3_24)
                imageList.add(R.drawable.detail_3_3_25)
            }
            11 -> {
                imageList.add(R.drawable.detail_3_3_26)
                imageList.add(R.drawable.detail_3_3_27)
            }
            12 -> {
                imageList.add(R.drawable.detail_3_3_28)
                imageList.add(R.drawable.detail_3_3_29)
            }
            13 -> {
                imageList.add(R.drawable.detail_3_3_30)
                imageList.add(R.drawable.detail_3_3_31)
            }
        }
        return imageList
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_detail33)
        CustomToast.showToast(this, "아래로 스크롤 해주세요.", R.layout.custom_normal_toast_step4)
        val uri: Uri? = intent.data
        if (uri != null) {
            val index = intent.getIntExtra("index", 0)

            val imageList = getImageList(index)
            val basicImageInfo = getBasicImage(index)

            if (imageList.size > 0) {
                val adapter = ImagePagerAdapter(this, imageList)
                viewPager.adapter = adapter
                setIndicatorView(imageList)
            }
            if (basicImageInfo != null) {
                val layoutParams = basicImageFrame.layoutParams
                layoutParams.width = basicImageInfo.width
                layoutParams.height = basicImageInfo.height
                basicImageFrame.layoutParams = layoutParams
                basicImageFrame.visibility = View.VISIBLE
                basicImage.setImageResource(basicImageInfo.imageId)
                basicImageText.text = basicImageInfo.text
            }

            val map = getDetailInfoMap(uri)
            setDetailInfo(map)
        }
        closeButton.setOnClickListener { finish() }

        rootView.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
            }
            false
        }
        myScrollView.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
            }
            false
        }


    }
    private fun convertToAppropriateType(value: String): Any {
        return when {
            value.toIntOrNull() != null -> value.toInt()
            value.toLongOrNull() != null -> value.toLong()
            value.toFloatOrNull() != null -> value.toFloat()
            value.toDoubleOrNull() != null -> value.toDouble()
            value.toBooleanStrictOrNull() != null -> value.toBooleanStrict()
            else -> value
        }

    }

}
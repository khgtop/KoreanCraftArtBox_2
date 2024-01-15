package com.example.koreancraftartbox2

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Paint
import android.graphics.Typeface
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.core.widget.NestedScrollView
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_content_detail31.*


class ContentDetailActivity31 : BaseActivity() {
    private val isOpenedList = mutableListOf(false, false, false, false, false, false,false, false, false, false, false, false, false, false, false, false, false, false, false)

    private fun setOpenClickListener(view: View, index: Int) {
        val layout = view.findViewById<LinearLayout>(getLayoutId(index))
        val detailText = view.findViewById<TextView>(getDetailTextId(index))
        val img = view.findViewById<ImageView>(getImgId(index))
        val openText = view.findViewById<TextView>(getOpenTextId(index))
        val title = view.findViewById<TextView>(getTitleId(index))
        val number = view.findViewById<TextView>(getNumberId(index))

        layout.setOnClickListener {
            isOpenedList[index] = !isOpenedList[index]
            val isOpened = isOpenedList[index]
            detailText.visibility = if (isOpened) View.VISIBLE else View.GONE
            img.setImageResource(if (isOpened) R.drawable.button_caret_close_medium else R.drawable.button_caret_open_medium)
            openText.text = getString(if (isOpened) R.string.close else R.string.open)
            openText.paintFlags = openText.paintFlags or Paint.UNDERLINE_TEXT_FLAG
            title.typeface = getTypeface(if (isOpened) R.font.suit_bold else R.font.suit_medium)
            number.setBackgroundResource(if (isOpened) R.drawable.note_number_box_black else R.drawable.note_number_box)
            number.setTextColor(ContextCompat.getColor(this, if (isOpened) R.color.white else R.color.black))
        }
    }
    private fun setNote(index: Int) {
        when (index){
            0 -> {
                val view = layoutInflater.inflate(R.layout.note_11, null)
                val modalBottomSheet = BottomSheetDialog(this)
                modalBottomSheet.setContentView(view)

                val closeNoteButton = view.findViewById<ImageView>(R.id.button_close_note)
                closeNoteButton.setOnClickListener { modalBottomSheet.dismiss()
                    CustomToast.cancelToast()}
                val myScrollView = view.findViewById<NestedScrollView>(R.id.myScrollView)
                myScrollView.setOnTouchListener { _, event ->
                    if (event.action == MotionEvent.ACTION_DOWN) {
                        CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
                    }
                    false
                }
                setOpenClickListener(view, 0)
                setOpenClickListener(view, 1)
                setOpenClickListener(view, 2)
                setOpenClickListener(view, 3)
                setOpenClickListener(view, 4)
                setOpenClickListener(view, 5)
                setOpenClickListener(view, 6)
                setOpenClickListener(view, 7)
                setOpenClickListener(view, 8)

                Glide.with(this).load(R.raw.button_note_gif).into(showBottomSheetButton)
                showBottomSheetButton.setOnClickListener {
                    showBottomSheetButton.setImageResource(R.drawable.button_note)
                    modalBottomSheet.show()
                    modalBottomSheet.behavior.state = BottomSheetBehavior.STATE_EXPANDED
                    modalBottomSheet.behavior.isDraggable = false
                    CustomToast.showToast(this, "아래로 스크롤 해주세요.", R.layout.custom_toast_note)
                }
            }
            1 -> {
                val view = layoutInflater.inflate(R.layout.note_12, null)
                val modalBottomSheet = BottomSheetDialog(this)
                modalBottomSheet.setContentView(view)

                val closeNoteButton = view.findViewById<ImageView>(R.id.button_close_note)
                closeNoteButton.setOnClickListener { modalBottomSheet.dismiss()
                    CustomToast.cancelToast()}
                val myScrollView = view.findViewById<NestedScrollView>(R.id.myScrollView)
                myScrollView.setOnTouchListener { _, event ->
                    if (event.action == MotionEvent.ACTION_DOWN) {
                        CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
                    }
                    false
                }
                setOpenClickListener(view, 0)
                setOpenClickListener(view, 1)
                setOpenClickListener(view, 2)
                setOpenClickListener(view, 3)
                setOpenClickListener(view, 4)
                setOpenClickListener(view, 5)
                setOpenClickListener(view, 6)
                setOpenClickListener(view, 7)
                setOpenClickListener(view, 8)
                setOpenClickListener(view, 9)
                setOpenClickListener(view, 10)
                setOpenClickListener(view, 11)
                setOpenClickListener(view, 12)
                setOpenClickListener(view, 13)
                setOpenClickListener(view, 14)
                setOpenClickListener(view, 15)
                setOpenClickListener(view, 16)
                setOpenClickListener(view, 17)
                setOpenClickListener(view, 18)

                Glide.with(this).load(R.raw.button_note_gif).into(showBottomSheetButton)
                showBottomSheetButton.setOnClickListener {
                    showBottomSheetButton.setImageResource(R.drawable.button_note)
                    modalBottomSheet.show()
                    modalBottomSheet.behavior.state = BottomSheetBehavior.STATE_EXPANDED
                    modalBottomSheet.behavior.isDraggable = false
                    CustomToast.showToast(this, "아래로 스크롤 해주세요.", R.layout.custom_toast_note)
                }
            }
            2 -> {
                val view = layoutInflater.inflate(R.layout.note_13, null)
                val modalBottomSheet = BottomSheetDialog(this)
                modalBottomSheet.setContentView(view)

                val closeNoteButton = view.findViewById<ImageView>(R.id.button_close_note)
                closeNoteButton.setOnClickListener { modalBottomSheet.dismiss()
                    CustomToast.cancelToast()}
                val myScrollView = view.findViewById<NestedScrollView>(R.id.myScrollView)
                myScrollView.setOnTouchListener { _, event ->
                    if (event.action == MotionEvent.ACTION_DOWN) {
                        CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
                    }
                    false
                }
                setOpenClickListener(view, 0)
                setOpenClickListener(view, 1)
                setOpenClickListener(view, 2)
                setOpenClickListener(view, 3)
                setOpenClickListener(view, 4)
                setOpenClickListener(view, 5)
                setOpenClickListener(view, 6)
                setOpenClickListener(view, 7)
                setOpenClickListener(view, 8)
                setOpenClickListener(view, 9)
                setOpenClickListener(view, 10)
                setOpenClickListener(view, 11)

                Glide.with(this).load(R.raw.button_note_gif).into(showBottomSheetButton)
                showBottomSheetButton.setOnClickListener {
                    showBottomSheetButton.setImageResource(R.drawable.button_note)
                    modalBottomSheet.show()
                    modalBottomSheet.behavior.state = BottomSheetBehavior.STATE_EXPANDED
                    modalBottomSheet.behavior.isDraggable = false
                    CustomToast.showToast(this, "아래로 스크롤 해주세요.", R.layout.custom_toast_note)
                }
            }
            3 -> {
                val view = layoutInflater.inflate(R.layout.note_14, null)
                val modalBottomSheet = BottomSheetDialog(this)
                modalBottomSheet.setContentView(view)

                val closeNoteButton = view.findViewById<ImageView>(R.id.button_close_note)
                closeNoteButton.setOnClickListener { modalBottomSheet.dismiss()
                    CustomToast.cancelToast()}
                val myScrollView = view.findViewById<NestedScrollView>(R.id.myScrollView)
                myScrollView.setOnTouchListener { _, event ->
                    if (event.action == MotionEvent.ACTION_DOWN) {
                        CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
                    }
                    false
                }
                setOpenClickListener(view, 0)
                setOpenClickListener(view, 1)
                setOpenClickListener(view, 2)
                setOpenClickListener(view, 3)
                setOpenClickListener(view, 4)
                setOpenClickListener(view, 5)
                setOpenClickListener(view, 6)
                setOpenClickListener(view, 7)
                setOpenClickListener(view, 8)
                setOpenClickListener(view, 9)
                setOpenClickListener(view, 10)
                setOpenClickListener(view, 11)

                Glide.with(this).load(R.raw.button_note_gif).into(showBottomSheetButton)
                showBottomSheetButton.setOnClickListener {
                    showBottomSheetButton.setImageResource(R.drawable.button_note)
                    modalBottomSheet.show()
                    modalBottomSheet.behavior.state = BottomSheetBehavior.STATE_EXPANDED
                    modalBottomSheet.behavior.isDraggable = false
                    CustomToast.showToast(this, "아래로 스크롤 해주세요.", R.layout.custom_toast_note)
                }
            }
            4 -> {
                val view = layoutInflater.inflate(R.layout.note_15, null)
                val modalBottomSheet = BottomSheetDialog(this)
                modalBottomSheet.setContentView(view)

                val closeNoteButton = view.findViewById<ImageView>(R.id.button_close_note)
                closeNoteButton.setOnClickListener { modalBottomSheet.dismiss()
                    CustomToast.cancelToast()}
                val myScrollView = view.findViewById<NestedScrollView>(R.id.myScrollView)
                myScrollView.setOnTouchListener { _, event ->
                    if (event.action == MotionEvent.ACTION_DOWN) {
                        CustomToast.cancelToast() // 터치 이벤트 발생 시 토스트를 취소합니다.
                    }
                    false
                }
                setOpenClickListener(view, 0)
                setOpenClickListener(view, 1)
                setOpenClickListener(view, 2)
                setOpenClickListener(view, 3)
                setOpenClickListener(view, 4)
                setOpenClickListener(view, 5)
                setOpenClickListener(view, 6)
                setOpenClickListener(view, 7)
                setOpenClickListener(view, 8)
                setOpenClickListener(view, 9)
                setOpenClickListener(view, 10)

                Glide.with(this).load(R.raw.button_note_gif).into(showBottomSheetButton)
                showBottomSheetButton.setOnClickListener {
                    showBottomSheetButton.setImageResource(R.drawable.button_note)
                    modalBottomSheet.show()
                    modalBottomSheet.behavior.state = BottomSheetBehavior.STATE_EXPANDED
                    modalBottomSheet.behavior.isDraggable = false
                    CustomToast.showToast(this, "아래로 스크롤 해주세요.", R.layout.custom_toast_note)
                }
            }
        }

        showBottomSheetButton.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                showBottomSheetButton.setImageResource(R.drawable.button_note_fill)
            } else if (event.action == MotionEvent.ACTION_UP) {
                showBottomSheetButton.setImageResource(R.drawable.button_note)
            }
            false
        }
    }

    // Helper functions to get resource IDs
    private fun getLayoutId(index: Int): Int = when (index) {
        0 -> R.id.open1
        1 -> R.id.open2
        2 -> R.id.open3
        3 -> R.id.open4
        4 -> R.id.open5
        5 -> R.id.open6
        6 -> R.id.open7
        7 -> R.id.open8
        8 -> R.id.open9
        9 -> R.id.open10
        10 -> R.id.open11
        11 -> R.id.open12
        12 -> R.id.open13
        13 -> R.id.open14
        14 -> R.id.open15
        15 -> R.id.open16
        16 -> R.id.open17
        17 -> R.id.open18
        18 -> R.id.open19
        // Add more cases for additional views
        else -> throw IllegalArgumentException("Invalid index")
    }

    private fun getDetailTextId(index: Int): Int = when (index) {
        0 -> R.id.detail_text_1
        1 -> R.id.detail_text_2
        2 -> R.id.detail_text_3
        3 -> R.id.detail_text_4
        4 -> R.id.detail_text_5
        5 -> R.id.detail_text_6
        6 -> R.id.detail_text_7
        7 -> R.id.detail_text_8
        8 -> R.id.detail_text_9
        9 -> R.id.detail_text_10
        10 -> R.id.detail_text_11
        11 -> R.id.detail_text_12
        12 -> R.id.detail_text_13
        13 -> R.id.detail_text_14
        14 -> R.id.detail_text_15
        15 -> R.id.detail_text_16
        16 -> R.id.detail_text_17
        17 -> R.id.detail_text_18
        18 -> R.id.detail_text_19
        // Add more cases for additional views
        else -> throw IllegalArgumentException("Invalid index")
    }

    private fun getImgId(index: Int): Int = when (index) {
        0 -> R.id.openImg1
        1 -> R.id.openImg2
        2 -> R.id.openImg3
        3 -> R.id.openImg4
        4 -> R.id.openImg5
        5 -> R.id.openImg6
        6 -> R.id.openImg7
        7 -> R.id.openImg8
        8 -> R.id.openImg9
        9 -> R.id.openImg10
        10 -> R.id.openImg11
        11 -> R.id.openImg12
        12 -> R.id.openImg13
        13 -> R.id.openImg14
        14 -> R.id.openImg15
        15 -> R.id.openImg16
        16 -> R.id.openImg17
        17 -> R.id.openImg18
        18 -> R.id.openImg19
        // Add more cases for additional views
        else -> throw IllegalArgumentException("Invalid index")
    }

    private fun getOpenTextId(index: Int): Int = when (index) {
        0 -> R.id.openText1
        1 -> R.id.openText2
        2 -> R.id.openText3
        3 -> R.id.openText4
        4 -> R.id.openText5
        5 -> R.id.openText6
        6 -> R.id.openText7
        7 -> R.id.openText8
        8 -> R.id.openText9
        9 -> R.id.openText10
        10 -> R.id.openText11
        11 -> R.id.openText12
        12 -> R.id.openText13
        13 -> R.id.openText14
        14 -> R.id.openText15
        15 -> R.id.openText16
        16 -> R.id.openText17
        17 -> R.id.openText18
        18 -> R.id.openText19
        // Add more cases for additional views
        else -> throw IllegalArgumentException("Invalid index")
    }

    private fun getTitleId(index: Int): Int = when (index) {
        0 -> R.id.title1
        1 -> R.id.title2
        2 -> R.id.title3
        3 -> R.id.title4
        4 -> R.id.title5
        5 -> R.id.title6
        6 -> R.id.title7
        7 -> R.id.title8
        8 -> R.id.title9
        9 -> R.id.title10
        10 -> R.id.title11
        11 -> R.id.title12
        12 -> R.id.title13
        13 -> R.id.title14
        14 -> R.id.title15
        15 -> R.id.title16
        16 -> R.id.title17
        17 -> R.id.title18
        18 -> R.id.title19
        // Add more cases for additional views
        else -> throw IllegalArgumentException("Invalid index")
    }

    private fun getNumberId(index: Int): Int = when (index) {
        0 -> R.id.number1
        1 -> R.id.number2
        2 -> R.id.number3
        3 -> R.id.number4
        4 -> R.id.number5
        5 -> R.id.number6
        6 -> R.id.number7
        7 -> R.id.number8
        8 -> R.id.number9
        9 -> R.id.number10
        10 -> R.id.number11
        11 -> R.id.number12
        12 -> R.id.number13
        13 -> R.id.number14
        14 -> R.id.number15
        15 -> R.id.number16
        16 -> R.id.number17
        17 -> R.id.number18
        18 -> R.id.number19
        // Add more cases for additional views
        else -> throw IllegalArgumentException("Invalid index")
    }

    private fun getTypeface(fontResId: Int): Typeface? =
        ResourcesCompat.getFont(this, fontResId)
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
        basic.text = map["basic"].toString()
        history.text = map["history"].toString()
        if (map["history2"] != null)
            history2.text = map["history2"].toString()

        if (map["reference"] != null)
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
            0 -> basicImageInfo(R.drawable.detail_3_1_6, "<건칠보살좌상>, 국립중앙박물관", 796, 946)
            1 -> basicImageInfo(R.drawable.detail_3_1_7, "<나전 칠 대모장식 봉황무늬 상자>, 서울공예박물관", 744, 566)
            2 -> basicImageInfo(R.drawable.detail_3_1_8, "<어피함>, 서울공예박물관", 744, 566)
            3 -> basicImageInfo(R.drawable.detail_3_1_9, "<흑칠채화 모란문 가께수리>, 조선,\n" +
                    "미국 호놀룰루미술관", 744, 566)
            4 -> basicImageInfo(R.drawable.detail_3_1_10, "<병-51>, 국립현대미술관", 744, 566)
            else -> null
        }
    }
    private fun getHistoryImage(index: Int):  basicImageInfo? {
        return when (index) {
            0 -> basicImageInfo(R.drawable.detail_3_1_11, "<무령왕비 베개>, 백제, 국립공주박물관", 744, 566)
            3 -> basicImageInfo(R.drawable.detail_3_1_12, "능산리사지 출토 칠기", 744, 566)
            else -> null
        }
    }

    private fun getImageList(index: Int):  ArrayList<Int> {
        val imageList = ArrayList<Int>()
        when (index) {
            0 -> {
                imageList.add(R.drawable.detail_3_1_1)
            }
            1 -> {
                imageList.add(R.drawable.detail_3_1_2)
            }
            2 -> {
                imageList.add(R.drawable.detail_3_1_3)
            }
            3 -> {
                imageList.add(R.drawable.detail_3_1_4)
            }
            4 -> {
                imageList.add(R.drawable.detail_3_1_5)
            }
        }
        return imageList
    }
    data class videoResourceInfo(val videoId: Int, val text: String)
    private fun getVideoResource(index: Int):  videoResourceInfo? {
        return when (index) {
            0 -> videoResourceInfo(R.raw.video15, "금박 시편 제작 과정 보기")
            1 -> videoResourceInfo(R.raw.video16, "대모와 금속선 시편 제작 과정 보기")
            2 -> videoResourceInfo(R.raw.video17, "어피 시편 제작 과정 보기")
            3 -> videoResourceInfo(R.raw.video18, "칠화 시편 제작 과정 보기")
            4 -> videoResourceInfo(R.raw.video19, "난각 시편 제작 과정 보기")
            else -> null
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_detail31)
        CustomToast.showToast(this, "아래로 스크롤 해주세요.", R.layout.custom_normal_toast_step4)
        val uri: Uri? = intent.data
        if (uri != null) {
            val index = intent.getIntExtra("index", 0)

            val imageList = getImageList(index)
            val basicImageInfo = getBasicImage(index)
            val historyImageInfo = getHistoryImage(index)

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
            if (historyImageInfo != null) {
                val layoutParams = historyImageFrame.layoutParams
                layoutParams.width = historyImageInfo.width
                layoutParams.height = historyImageInfo.height
                historyImageFrame.layoutParams = layoutParams
                historyImageFrame.layoutParams = layoutParams
                historyImageFrame.visibility = View.VISIBLE
                historyImage.setImageResource(historyImageInfo.imageId)
                historyImageText.text = historyImageInfo.text
            }

            val videoUri = Uri.parse("android.resource://${this.packageName}/${R.raw.video14}")
            videoImageView1.setImageBitmap(extractFrameFromVideo(videoUri, 300))
            videoImageView1.setOnClickListener {
                val intent = Intent(this, VideoFullScreenActivity::class.java)
                intent.data = videoUri
                startActivity(intent)
            }

            val videoResource = getVideoResource(index)
            if (videoResource != null) {
                videoText.text = videoResource.text
                val videoUri = Uri.parse("android.resource://${this.packageName}/${videoResource.videoId}")
                videoImageView2.setImageBitmap(extractFrameFromVideo(videoUri, 300))

                videoImageView2.setOnClickListener {
                    val intent = Intent(this, VideoFullScreenActivity::class.java)
                    intent.data = videoUri
                    startActivity(intent)
                }
            }

            if (index == 1) {
                subTitle.setTextSize(android.util.TypedValue.COMPLEX_UNIT_PX, 44f)
                val textViewLayoutParams = summary.layoutParams.apply {
                    height =180
                }
                summary.layoutParams = textViewLayoutParams
                val layoutParams = viewPager.layoutParams as ViewGroup.MarginLayoutParams
                layoutParams.setMargins(139, 130, 0, 87)
                viewPager.layoutParams = layoutParams
            }

            if (index == 0 || index == 1) {
                history2.visibility = View.VISIBLE
            }
            if (index == 4) {
                referenceTitle.visibility = View.GONE
                reference.visibility = View.GONE
            }
            val map = getDetailInfoMap(uri)
            setDetailInfo(map)
            setNote(index)
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
package com.example.koreancraftartbox2

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_content_detail343.*

class ContentDetailActivity343 : BaseActivity() {
    private var isOpened = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_detail343)
        closeButton.setOnClickListener { finish() }
        open.setOnClickListener {
            if (isOpened) {
                isOpened = false
                detail_specification.visibility = View.GONE
                openImg.setImageResource(R.drawable.button_caret_open_small)
                val textFromResources: String = getString(R.string.open)
                openText.text = textFromResources
                openText.paintFlags = openText.paintFlags or Paint.UNDERLINE_TEXT_FLAG
            } else {
                isOpened = true
                detail_specification.text = "0.2×16.7\n" +
                        "0.8×18.6\n" +
                        "0.5×18.0\n" +
                        "1.1×18.0\n" +
                        "1.1×18.0"
                detail_specification.visibility = View.VISIBLE
                openImg.setImageResource(R.drawable.button_caret_close_small)
                val textFromResources: String = getString(R.string.close)
                openText.paintFlags = openText.paintFlags or Paint.UNDERLINE_TEXT_FLAG
                openText.text = textFromResources
            }
        }
    }
}
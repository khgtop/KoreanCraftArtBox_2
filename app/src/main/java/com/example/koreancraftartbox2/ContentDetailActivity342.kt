package com.example.koreancraftartbox2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_content_detail342.*

class ContentDetailActivity342 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_detail342)
        closeButton.setOnClickListener { finish() }
    }
}
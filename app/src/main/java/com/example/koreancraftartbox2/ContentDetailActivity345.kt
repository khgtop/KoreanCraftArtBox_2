package com.example.koreancraftartbox2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_content_detail345.*

class ContentDetailActivity345 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_detail345)
        closeButton.setOnClickListener { finish() }
    }
}
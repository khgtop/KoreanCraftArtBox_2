package com.example.koreancraftartbox2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_content_detail346.*

class ContentDetailActivity346 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_detail346)
        closeButton.setOnClickListener { finish() }
    }
}
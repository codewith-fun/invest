package com.codeblogs.investwell

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.libs.investwell.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToasterMessage.s(this,"pagal")

    }
}
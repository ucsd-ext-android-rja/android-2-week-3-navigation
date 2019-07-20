package com.ucsdextandroid2.screennavigation.mainmenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ucsdextandroid2.screennavigation.R
import com.ucsdextandroid2.screennavigation.instagram.InstagramActivity
import com.ucsdextandroid2.screennavigation.twitter.TwitterActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

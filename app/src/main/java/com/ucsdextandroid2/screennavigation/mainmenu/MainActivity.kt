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
        setContentView(R.layout.fragment_main_menu)

        findViewById<Button>(R.id.am_button_1).setOnClickListener {
            startActivity(Intent(this, InstagramActivity::class.java))
        }

        findViewById<Button>(R.id.am_button_2).setOnClickListener {
            startActivity(Intent(this, TwitterActivity::class.java))
        }
    }
}

package com.example.services

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fb
        btn_fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"))
            startActivity(i)
        })
        //ig
        btn_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"))
            startActivity(i)
        })
        //mp3
        var MediaPlayer:MediaPlayer?=MediaPlayer.create(this,R.raw.top)

        //btn play
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        //btn pause
        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }

        //btn stop
        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}

package com.applex.kotlinbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val = const
        val initialTvTransY = textview_progress.translationY

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textview_progress.text = progress.toString()
                val translationDist = (initialTvTransY + progress * resources.getDimension(R.dimen.text_anim_step) * -1)
                textview_progress.translationY = translationDist

                if(!fromUser)
                    textview_progress.animate().setDuration(500).rotationBy(360f).translationY(initialTvTransY)

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })

        textview_progress.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        button.setOnClickListener{
            seekBar.progress = 0
//            textview_progress.animate().setDuration(500).rotationBy(360f).translationY(initialTvTransY)

        }
    }
}
package com.example.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekbar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean)
            {
                progressbar.setProgress(p1)
                text_progress.setText("" + p1 + "%")
            }

            override fun onStartTrackingTouch(p0: SeekBar?)
            {

            }

            override fun onStopTrackingTouch(p0: SeekBar?)
            {

            }

        })
    }
}
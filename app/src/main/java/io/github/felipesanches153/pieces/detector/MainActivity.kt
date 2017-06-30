package io.github.felipesanches153.pieces.detector

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.opencv.android.OpenCVLoader

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_text_view.text = if (OpenCVLoader.initDebug()) "OpenCV OK" else "OpenCV not OK"
    }

}

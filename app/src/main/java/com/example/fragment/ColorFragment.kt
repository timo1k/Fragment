package com.example.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout

class ColorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false).apply {
            findViewById<FrameLayout>(R.id.frame).setOnClickListener{
                setBackgroundColor(Color.parseColor(
                    arrayOf("blue","cyan","green").random()
                ))
            }
        }
    }

}
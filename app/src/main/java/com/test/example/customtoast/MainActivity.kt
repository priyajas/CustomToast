package com.test.example.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.test.example.customtoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val layout: View = layoutInflater.inflate(R.layout.custom_toast, null)
        binding.constraintLayout.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_SHORT
                setGravity(Gravity.CENTER, 0, 0)
                view = layout
            }.show()
        }


    }
}
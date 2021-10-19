package com.realtomjoney.debugwithlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.realtomjoney.debugwithlog.databinding.ActivityMainBinding

private const val TAG: String = "MyActivity"

class MainActivity : AppCompatActivity() {
    /*
    Log.v // Verbose (print everything out)
    Log.d // Debug
    Log.i // Info (successful information)
    Log.w // Warnings (situations where something that you didn't expect happened, but it's not an error)
    Log.e // An error
    Log.wtf // Find whatever Android Studio can find for you
     */
    private lateinit var binding: ActivityMainBinding

    var myLabel: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        Log.d(TAG, "Line 25")

        Log.d(TAG, "Line 30")

        Log.d(MainActivity::class.java.simpleName, "Value")

    }

    private fun setBindings() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
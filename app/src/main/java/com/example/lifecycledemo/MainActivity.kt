package com.example.lifecycledemo
import android.widget.TextView
import android.util.Log
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var tvStatus: TextView
    override fun onCreate(savedInstanceState:
                          Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvStatus = findViewById(R.id.tvStatus)
        tvStatus.text = "État : onCreate"
        Log.d("LIFECYCLE", "onCreate appelé")
    }
    override fun onStart() {
        super.onStart()
        tvStatus.text = "État : onStart"
        Log.d("LIFECYCLE", "onStart appelé")
    }

    override fun onResume() {
        super.onResume()
        tvStatus.text = "État : onResume"
        Log.d("LIFECYCLE", "onResume appelé")
    }
    override fun onPause() {
        super.onPause()
        tvStatus.text = "État : onPause"
        Log.d("LIFECYCLE", "onPause appelé")
    }
    override fun onStop() {
        super.onStop()
        tvStatus.text = "État : onStop"
        Log.d("LIFECYCLE", "onStop appelé")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFECYCLE", "onDestroy appelé")
    }
}
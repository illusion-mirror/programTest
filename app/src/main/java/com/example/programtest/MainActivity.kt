package com.example.programtest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.programtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val tag = "Circly Life"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(tag,"OnCreate")
        val startDialogButton = findViewById<Button>(R.id.startDialogActivity)
        val startNormalButton = findViewById<Button>(R.id.startNormalActivity)
        startDialogButton.setOnClickListener {
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
        startNormalButton.setOnClickListener {
            val intent = Intent(this, NormalActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag,"onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag,"onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag,"onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag,"onRestart")
    }

}
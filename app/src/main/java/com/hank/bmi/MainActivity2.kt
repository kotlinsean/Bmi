package com.hank.bmi

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hank.bmi.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val secret = (1..10).random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        //R.id.hello_main
        //R.string.ok
        //R.color.messageColor
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this, "secret:$secret", Toast.LENGTH_LONG).show()
    }
    fun guess(view: View) {
        if (!binding.number.text.toString().equals("")) {
            val num = binding.number.text.toString().toInt()
            Log.d("MainActivity2", num.toString())
            val message = if (num >secret) {
                getString(R.string.smaller)
            } else if (num < secret) {
                getString(R.string.bigger)
            } else {
                getString(R.string.you_got_it)
            }
            AlertDialog.Builder(this)
                .setTitle(getString(R.string.info))
                .setMessage(message)
                .setPositiveButton(getString((R.string.ok)), null)
                .show()
        } else {
            Toast.makeText(this,
                getString(R.string.please_enter_a_number_1_10), Toast.LENGTH_LONG).show()
        }
    }
}
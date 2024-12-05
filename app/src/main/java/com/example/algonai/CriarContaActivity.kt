package com.example.algonai

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.algonai.databinding.ActicityLoginBinding
import com.example.algonai.databinding.ActivityCriarContaBinding

class CriarContaActivity : AppCompatActivity() {
    lateinit var binding: ActivityCriarContaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriarContaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idJaTenhoConta.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
        }
    }
}
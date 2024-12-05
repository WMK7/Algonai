package com.example.algonai

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.algonai.databinding.ActicityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActicityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActicityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Botão de login para criar uma conta
        binding.idCriarConta.setOnClickListener {
            val intent = Intent(this, CriarContaActivity::class.java)
            startActivity(intent)
        }

    }
}
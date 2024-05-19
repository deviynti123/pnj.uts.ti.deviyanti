package com.example.pnjutstideviyanti

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var save = getSharedPreferences("Profile", MODE_PRIVATE)
        if(save.getBoolean("isLogin", false)){
            var pindah = Intent(applicationContext, MainActivity::class.java)
            startActivity(pindah)
            finish()
        }else{

        }

    }

}
package com.example.pnjutstideviyanti

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    lateinit var edtUname: EditText
    lateinit var edtPass: EditText
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edtUname = findViewById(R.id.edtUname)
        edtPass = findViewById(R.id.edtPass)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            if (edtUname.text.toString().equals("devi@gmail.com") && edtPass.text.toString()
                    .equals("1234")
            ) {
                var data = getSharedPreferences("Profile", Context.MODE_PRIVATE)
                var edit = data.edit()
                edit.putString("email", "devi@gmail.com")
                edit.putString("nim", "12345")
                edit.putString("nama", "devi")
                edit.putString("kelas", "TI 4A")
                edit.putBoolean("isLogin", true)
                edit.commit()

                var pindah = Intent(applicationContext, MainActivity::class.java)
                startActivity(pindah)
                finish()
            }
            else{
                Toast.makeText(applicationContext,"Login Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
package com.example.apikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.nio.file.attribute.AclFileAttributeView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submit_btn(view: View) {
        val namaEditText=findViewById<EditText>(R.id.nama_edit_text)
        val nama = namaEditText.text.toString()

        val toast= Toast.makeText(applicationContext,nama,Toast.LENGTH_SHORT)
        toast.show()
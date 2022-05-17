package com.example.search

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var edt:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        edt = findViewById(R.id.edt)

        btn.setOnClickListener({
            var it = Intent(Intent.ACTION_WEB_SEARCH)
            it.putExtra(SearchManager.QUERY, edt.text.toString())
            startActivity(it)
        })
    }
}
package ru.spbstu.lab3task3


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import ru.spbstu.lab3task3.databinding.Activity3Binding
import android.view.Menu


class Activity3 : AppCompatActivity() {

    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        binding.bnToFirst.setOnClickListener {
            startActivity(Intent(this, ActivityMain::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
        binding.bnToSecond.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_about -> {
                startActivity(Intent(this, ActivityAbout::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
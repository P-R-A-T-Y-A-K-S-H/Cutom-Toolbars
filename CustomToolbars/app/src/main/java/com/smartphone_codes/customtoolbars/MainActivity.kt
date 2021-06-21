package com.smartphone_codes.customtoolbars

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_CustomToolbars)
        setContentView(R.layout.activity_main)
        val img: ImageView = findViewById(R.id.looks)
        val bar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbarandro)
        setSupportActionBar(bar)
        supportActionBar?.title = ""
        val win: Window = window
        win.setBackgroundDrawableResource(R.drawable.bg1gradient)

        val card1: CardView = findViewById(R.id.card1)
        val card2: CardView = findViewById(R.id.card2)
        val card3: CardView = findViewById(R.id.card3)
        val card4: CardView = findViewById(R.id.card4)
        val card5: CardView = findViewById(R.id.card5)
        val card6: CardView = findViewById(R.id.card6)


        fun setToolbar(view: View) {
            when (view.id) {
                R.id.card1 -> {
                    supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.toolbar1))
                    win.setBackgroundDrawableResource(R.drawable.tool)
                    img.setImageResource(R.drawable.bg1)
                    supportActionBar?.title = ""
                }
                R.id.card2 -> {
                    supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.toolbar2))
                    win.setBackgroundDrawableResource(R.drawable.bg1gradient)
                    supportActionBar?.title = ""
                    img.setImageResource(R.drawable.bg2)
                }
                R.id.card3 -> {
                    supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.toolbar3))
                    win.setBackgroundDrawableResource(R.drawable.toolbar3)
                    supportActionBar?.title = "Forest"
                    img.setImageResource(R.drawable.bg3)
                }
                R.id.card4 -> {
                    supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.toolbar4))
                    win.setBackgroundDrawableResource(R.drawable.tool)
                    supportActionBar?.title = "Nature"
                    img.setImageResource(R.drawable.bg4)
                }
                R.id.card5 -> {
                    supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.toolbar5))
                    win.setBackgroundDrawableResource(R.drawable.toolbar5)
                    img.setImageResource(R.drawable.bg5)
                    supportActionBar?.title = ""
                }
                R.id.card6 -> {
                    supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.toolbar6))
                    win.setBackgroundDrawableResource(R.drawable.toolbar6)
                    img.setImageResource(R.drawable.bg)
                    supportActionBar?.title = "COVID-19"
                }
            }
        }

        card1.setOnClickListener { setToolbar(card1) }
        card2.setOnClickListener { setToolbar(card2) }
        card3.setOnClickListener { setToolbar(card3) }
        card4.setOnClickListener { setToolbar(card4) }
        card5.setOnClickListener { setToolbar(card5) }
        card6.setOnClickListener { setToolbar(card6) }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.layout_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.changeTheme -> {
                findViewById<CardView>(R.id.card2).performClick()
                Toast.makeText(this, "Toolbar Theme Reset", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}
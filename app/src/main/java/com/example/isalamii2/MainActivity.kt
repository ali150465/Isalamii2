package com.example.isalamii2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.isalamii2.mainfragment.ahadesfragment
import com.example.isalamii2.mainfragment.quranfragment
import com.example.isalamii2.mainfragment.radiofragment
import com.example.isalamii2.mainfragment.sabhafragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView=findViewById(R.id.bottomNavigationView_main)
        bottomNavigationView.setOnItemSelectedListener {
            if (it.itemId==R.id.Quran){
                pushfragment(quranfragment())
            }
            else if (it.itemId ==R.id.bt_ahades){
                pushfragment(ahadesfragment())
            }
            else if (it.itemId ==R.id.radio){
                pushfragment(radiofragment())
            }
            else if (it.itemId ==R.id.sebha){
                pushfragment(sabhafragment())
            }


return@setOnItemSelectedListener true
        }
        bottomNavigationView.selectedItemId=R.id.Quran
    }

    fun pushfragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container_fragment, fragment)
            .commit()
    }
}
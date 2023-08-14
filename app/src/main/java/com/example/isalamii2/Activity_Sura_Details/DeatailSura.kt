package com.example.isalamii2.Activity_Sura_Details

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.isalamii2.Intent_Key.Constant
import com.example.isalamii2.R

class DeatailSura : AppCompatActivity() {
    lateinit var Ayatrecyclerview: RecyclerView
    lateinit var AdapterAyat: Adapter_deatail_Sura
    var Suraname: String? = null
    var Suranpostion: Int? = null
    lateinit var suratitle: TextView
    lateinit var iconbackinsuradetails: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deatail_sura)
        Ayatrecyclerview = findViewById(R.id.content_deatail_Ayat)
        AdapterAyat = Adapter_deatail_Sura(null)
        Suraname = intent.getStringExtra(Constant.EXTRA_SURA_NAME)
        Suranpostion = intent.getIntExtra(Constant.Extra_SURA_POSTION, 0)
        Ayatrecyclerview.adapter = AdapterAyat
        readfilassets()
        suratitle = findViewById(R.id.title_sura_indetails)
        suratitle.text = Suraname
        iconbackinsuradetails = findViewById(R.id.backstackin_sura_details)
        iconbackinsuradetails.setOnClickListener {
            finish()
        }


    }

    fun readfilassets() {
        var filename = "${Suranpostion?.plus(1)}.txt"
        var filecontent: String = assets.open(filename).bufferedReader().use { it.readText() }
        var suracontent = filecontent.split("\n")
        AdapterAyat.updata(suracontent)
    }
}
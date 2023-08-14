package com.example.isalamii2.Ahades_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.isalamii2.Intent_Key.Constant
import com.example.isalamii2.R

class Ahades_content : AppCompatActivity() {
    var Hades_tittle: String? =null
    var Hadeas_content: String? =null
    lateinit var Icon_Back:ImageView
    lateinit var tittle_Hadeas:TextView
    lateinit var Content_Hadeas:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahades_content)
        Icon_Back=findViewById(R.id.icon_back)
        tittle_Hadeas=findViewById(R.id.title_Hades_incontent)
        Content_Hadeas=findViewById(R.id.Text_Hades_Content)
        Hades_tittle=intent.getStringExtra(Constant.EXTRA_HADES_NAME)
        Hadeas_content=intent.getStringExtra(Constant.EXTRA_HADES_POSSTION)
        Icon_Back.setOnClickListener({
            finish()
        }
        )
        tittle_Hadeas.text=Hades_tittle
        Content_Hadeas.text=Hadeas_content

    }

}
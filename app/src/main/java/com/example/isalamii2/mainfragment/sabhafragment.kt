package com.example.isalamii2.mainfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.isalamii2.R

class sabhafragment:Fragment() {
    lateinit var tasbeh: TextView
    lateinit var actasbeh: ImageView
    lateinit var counterTv: TextView
    var counter:Int=0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tasbehfragment,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actasbeh=view.findViewById(R.id.body_Sabha)
        counterTv=view.findViewById(R.id.containerTV)
        counterTv.text="$counter"
        tasbeh=view.findViewById(R.id.Tasbeh_zakr)
        actasbeh.setOnClickListener {
            actionsebha()
        }
        counterTv.setOnClickListener {
            actioincountertv()
        }

    }

    private fun actioincountertv() {
        counter++
        if (counter==33){
            counter=0
        }
        actasbeh.rotation=actasbeh.rotation +5
        counterTv.text="$counter"


    }

    private fun actionsebha() {
        actasbeh.rotation=actasbeh.rotation +5
        counter++
        counterTv.text="$counter"
        if (counter==33){
            counter=0
        }
    }

}
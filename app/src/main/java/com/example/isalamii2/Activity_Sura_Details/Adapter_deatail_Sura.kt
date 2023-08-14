package com.example.isalamii2.Activity_Sura_Details

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.isalamii2.R

class Adapter_deatail_Sura (var Suralines : List <String?>?):Adapter<Adapter_deatail_Sura.Viewholders_Suradeatail>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholders_Suradeatail {
        val inflater=LayoutInflater.from(parent.context)
        var view=inflater.inflate(R.layout.item_to_recyclerview_suradeatil,parent,false)
        return Viewholders_Suradeatail(view)
    }

    override fun onBindViewHolder(holder: Viewholders_Suradeatail, position: Int) {
        holder.Ayat.text=Suralines?.get(position)
    }

    override fun getItemCount(): Int {
    return Suralines?.size ?:0
    }
    fun updata(suralines :List<String?>?){
        this.Suralines=suralines
        notifyDataSetChanged()
    }

    class Viewholders_Suradeatail(itemview:View):ViewHolder(itemview){
        var Ayat:TextView
        init {
            Ayat=itemview.findViewById(R.id.item_Ayat)
        }


    }


}
package com.example.isalamii2.Activity_Sura_Details

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.isalamii2.R

class AdapterSuranname(var datasuraname: List<String>, var count: Int = 286) :
    Adapter<AdapterSuranname.SuranameviewHolder>() {
    var Setonname_clicke: Setonname_clicke? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuranameviewHolder {
        var inflater = LayoutInflater.from(parent.context)
        var View = inflater.inflate(R.layout.itemsuraname, parent, false)
        return SuranameviewHolder(View)

    }

    override fun onBindViewHolder(holder: SuranameviewHolder, position: Int) {

        holder.suraname.text = datasuraname.get(position)
        holder.suracount.text = "$count"
        holder.itemview.setOnClickListener({
            Setonname_clicke?.oncilckitem(position, datasuraname.get(position))
        }
        )
    }

    override fun getItemCount(): Int {
        return datasuraname.size
    }


    class SuranameviewHolder(var itemview: View) : RecyclerView.ViewHolder(itemview) {
        var suraname: TextView
        var suracount: TextView

        init {
            suraname = itemview.findViewById(R.id.itemSuraname)
            suracount = itemview.findViewById(R.id.itemsuracount)

        }

    }
}
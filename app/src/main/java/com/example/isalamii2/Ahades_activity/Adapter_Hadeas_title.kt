package com.example.isalamii2.Ahades_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.isalamii2.R

class Adapter_Hadeas_title(var Hadeas:List<Data_Hadeas?>?):RecyclerView.Adapter<Adapter_Hadeas_title.viewHolder_title_Hadeas>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder_title_Hadeas {
      var inflater=LayoutInflater.from(parent.context)
        var View=inflater.inflate(R.layout.item_ahdeas_title,parent,false)
        return viewHolder_title_Hadeas(View)
    }
    var onclickAhadesTittle:onclick_Ahades_tittle?=null

    override fun onBindViewHolder(holder: viewHolder_title_Hadeas, position: Int) {
     holder.title.text=Hadeas?.get(position)?.title
        holder.itemView.setOnClickListener({
            onclickAhadesTittle?.onclickitem(position,Hadeas?.get(position)?.title )
        }
        )
    }

    override fun getItemCount(): Int {
        return Hadeas?.size ?:0

    }

    class viewHolder_title_Hadeas(itemview:View):ViewHolder(itemview){
        var title:TextView
        init {
            title=itemview.findViewById(R.id.item_title_hadeas)
        }
    }
}
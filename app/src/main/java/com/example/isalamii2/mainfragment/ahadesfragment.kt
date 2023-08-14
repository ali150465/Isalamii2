package com.example.isalamii2.mainfragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.isalamii2.Ahades_activity.Adapter_Hadeas_title
import com.example.isalamii2.Ahades_activity.Ahades_content
import com.example.isalamii2.Ahades_activity.Data_Hadeas
import com.example.isalamii2.Ahades_activity.onclick_Ahades_tittle
import com.example.isalamii2.Intent_Key.Constant
import com.example.isalamii2.R

class ahadesfragment:Fragment() {
    lateinit var RecyclerView_title_Hadeas:RecyclerView
    lateinit var Adapter:Adapter_Hadeas_title
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ahadesfragment,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        readAhades()
        RecyclerView_title_Hadeas=view.findViewById(R.id.recyclerview_titles_Ahadeas_infragment)
        Adapter=Adapter_Hadeas_title(allHadeas)
        RecyclerView_title_Hadeas.adapter=Adapter
        Adapter.onclickAhadesTittle=object :onclick_Ahades_tittle{
            override fun onclickitem(posstion: Int?, Hades_name: String?) {
                var intent =Intent(requireActivity(),Ahades_content::class.java)
                intent.putExtra(Constant.EXTRA_HADES_NAME,Hades_name)
                intent.putExtra(Constant.EXTRA_HADES_POSSTION,allHadeas.get(posstion ?:0)?.content)
                startActivity(intent)
            }
        }

    }
    var allHadeas= mutableListOf<Data_Hadeas?>()
    fun readAhades(){
        val filename=activity?.assets?.open("ahadeth.txt")?.bufferedReader().use { it?.readText() }
        val filecontent=filename?.trim()?.split("#")
        filecontent?.forEach{
            var titlehades=it.trim().substringBefore("\n")
            var content_hades=it.trim().substringAfter("\n")
            val Hades=Data_Hadeas(titlehades,content_hades)
            allHadeas?.add(Hades)
        }
    }
}
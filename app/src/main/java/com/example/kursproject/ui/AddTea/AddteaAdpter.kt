package com.example.kursproject.ui.AddTea

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kursproject.R
import com.google.android.material.imageview.ShapeableImageView

class AddteaAdpter(private  val teaList:ArrayList<AddTeaData>):RecyclerView.Adapter<AddteaAdpter.Holder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
       val itemView=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return Holder(itemView)
    }

    override fun getItemCount(): Int {
        return teaList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        val currentitem = teaList[position]
        holder.img2.setImageResource(currentitem.img)
        holder.text2.text=currentitem.text
    }

    class Holder(itemsView:View):RecyclerView.ViewHolder(itemsView){
        val img2:ShapeableImageView=itemsView.findViewById(R.id.title_image)
        val text2:TextView=itemsView.findViewById(R.id.tvText)

    }
}
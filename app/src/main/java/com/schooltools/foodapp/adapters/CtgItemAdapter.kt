package com.schooltools.foodapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.schooltools.foodapp.AnimateView
import com.schooltools.foodapp.dataClasses.CtgItem
import com.schooltools.foodapp.databinding.RecyclerCtgItemBinding

class CtgItemAdapter(private val ctgItemList:List<CtgItem>) :RecyclerView.Adapter<CtgItemAdapter.ViewHolder>(){
    class ViewHolder(val binding: RecyclerCtgItemBinding) :RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerCtgItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ctgItemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.ctgItem.text=ctgItemList[position].name
        holder.binding.ctgIcon.setImageResource(ctgItemList[position].image)
        holder.itemView.setOnClickListener{
            AnimateView().animateButton(it,it.context)
        }
    }
}

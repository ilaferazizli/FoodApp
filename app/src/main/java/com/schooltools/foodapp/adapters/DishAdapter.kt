package com.schooltools.foodapp.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.schooltools.foodapp.dataClasses.Dish
import com.schooltools.foodapp.DishPage
import com.schooltools.foodapp.databinding.RecyclerGridBinding
import com.squareup.picasso.Picasso

class DishAdapter(private val dishList: List<Dish>): RecyclerView.Adapter<DishAdapter.ViewHolder>(){
    class ViewHolder(val binding:RecyclerGridBinding): RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerGridBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dishList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(dishList[position].image).into(holder.binding.dishImg)
        holder.binding.dishName.text = dishList[position].name
        holder.binding.rating.text = "${dishList[position].rating}"
        holder.binding.time.text= dishList[position].time
        holder.binding.price.text= String.format("$%.2f", dishList[position].price)
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DishPage::class.java)
            intent.putExtra("selectedDish", dishList[position])
            it.context.startActivity(intent)
        }
    }
}
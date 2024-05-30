package com.schooltools.foodapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.schooltools.foodapp.AnimateView
import com.schooltools.foodapp.dataClasses.Ingredient
import com.schooltools.foodapp.databinding.RecyclerIngredientsBinding

class IngredientAdapter(private val ingredientsList:List<Ingredient>): RecyclerView.Adapter<IngredientAdapter.IngredientViewHolder>() {
    class IngredientViewHolder(val binding: RecyclerIngredientsBinding) : RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientViewHolder {
        val binding = RecyclerIngredientsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return IngredientViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return ingredientsList.size
    }

    override fun onBindViewHolder(holder: IngredientViewHolder, position: Int) {
        holder.binding.ingredientImage.setImageResource(ingredientsList[position].ingredientImg)
        holder.binding.ingredientName.text = ingredientsList[position].name
        holder.itemView.setOnClickListener {
            AnimateView().animateButton(it,it.context)
        }
    }
}
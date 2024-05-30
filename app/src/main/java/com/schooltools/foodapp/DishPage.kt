package com.schooltools.foodapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.schooltools.foodapp.adapters.IngredientAdapter
import com.schooltools.foodapp.dataClasses.Dish
import com.schooltools.foodapp.dataClasses.Ingredient
import com.schooltools.foodapp.databinding.ActivityDishPageBinding
import com.squareup.picasso.Picasso

class DishPage : AppCompatActivity() {
    private lateinit var binding: ActivityDishPageBinding
    private lateinit var ingredientsList: List<Ingredient>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dish_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityDishPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addBtn.setOnClickListener { AnimateView().animateButton(it,this)}
        binding.back.setOnClickListener {finish()}

        ingredientsList= Objects().ingredientObjects
        binding.ingredientRecycleView.layoutManager= GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        binding.ingredientRecycleView.adapter= IngredientAdapter(ingredientsList)
        binding.like.setImageResource(R.drawable.vc_heart)
        val intent=intent
        val selectedItem=intent.getSerializableExtra("selectedDish") as Dish
        Picasso.get().load(selectedItem.image).into(binding.dish)
        binding.dishName.text=selectedItem.name
        binding.dishDescription.text=selectedItem.description
        binding.rating.text="${selectedItem.rating}"
        binding.time.text=selectedItem.time
        binding.calories.text=selectedItem.calories
        binding.ingredientCount.text="${ingredientsList.size} item"
        binding.price.text=String.format("$%.2f",selectedItem.price)

        binding.like.setOnClickListener {
            if(!selectedItem.isFavorite) {
                binding.like.setImageResource(R.drawable.vc_heart_colored)
                selectedItem.isFavorite=true
            }
            else {
                binding.like.setImageResource(R.drawable.vc_heart)
                selectedItem.isFavorite=false
            }
        }
    }
}
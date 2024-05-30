package com.schooltools.foodapp

import android.content.res.Configuration
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.schooltools.foodapp.adapters.CtgItemAdapter
import com.schooltools.foodapp.adapters.DishAdapter
import com.schooltools.foodapp.dataClasses.CtgItem
import com.schooltools.foodapp.dataClasses.Dish
import com.schooltools.foodapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var dishList: List<Dish>
    private lateinit var ctgItemList: List<CtgItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listOf(binding.profileImage,binding.all1,binding.all2).onEach { view ->
            view.setOnClickListener {
                AnimateView().animateButton(it,this@MainActivity)
            }
        }

        dishList= Objects().dishObjects
        ctgItemList= Objects().ctgObjects

        binding.recyclerGridView.layoutManager= GridLayoutManager(this,2)
        val dishAdapter= DishAdapter(dishList)
        binding.recyclerGridView.adapter=dishAdapter

        binding.categoryRecyclerView.layoutManager=GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false)
        val ctgAdapter= CtgItemAdapter(ctgItemList)
        binding.categoryRecyclerView.adapter=ctgAdapter
    }
    private fun flexibleGridSize():Int{
        return if (Configuration.ORIENTATION_LANDSCAPE == resources.configuration.orientation) 4
        else 2
    }
}
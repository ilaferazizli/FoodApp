package com.schooltools.foodapp.dataClasses

import java.io.Serializable
class Dish(
    val image: String,
    val name: String,
    val description: String,
    val rating: Double,
    val time: String,
    val calories: String,
    val price: Double,
    var isFavorite:Boolean=false
): Serializable{

}


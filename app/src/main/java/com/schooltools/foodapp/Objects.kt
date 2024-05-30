package com.schooltools.foodapp

import com.schooltools.foodapp.dataClasses.CtgItem
import com.schooltools.foodapp.dataClasses.Dish
import com.schooltools.foodapp.dataClasses.Ingredient

class Objects {
    private val dish1= Dish(
        "https://www.themealdb.com/images/category/beef.png",
        "Beef",
        "Beef is the culinary name for meat from cattle, particularly skeletal muscle. Humans have been eating beef since prehistoric times. Beef is a source of high-quality protein and essential nutrients.",
        5.0,
        "50 min",
        "120 kcal",
        45.99
    )
    private val dish2= Dish(
        "https://www.themealdb.com/images/category/chicken.png",
        "Chicken",
        "Chicken is a type of domesticated fowl, a subspecies of the red junglefowl. It is one of the most common and widespread domestic animals",
        4.8,
        "10 min",
        "100 kcal",
        36.00
    )

    private val dish3= Dish(
        "https://www.themealdb.com/images/category/dessert.png",
        "Dessert",
        "Dessert is a course that concludes a meal. The course usually consists of sweet foods, such as confections dishes or fruit, and possibly a beverage such as dessert wine or liqueur, however in the United States it may include coffee",
        4.1,
        "30 min",
        "70 kcal",
        29.00
    )
    private val dish4= Dish(
        "https://www.themealdb.com/images/category/lamb.png",
        "Lamb",
        "Lamb, hogget, and mutton are the meat of domestic sheep (species Ovis aries) at different ages.",
        3.5,
        "20 min",
        "200 kcal",
        20.00
    )
    private val dish5= Dish(
        "https://www.themealdb.com/images/category/miscellaneous.png",
        "Miscellaneous",
        "General foods that don't fit into another category",
        5.0,
        "50 min",
        "200 kcal",
        45.99
    )
    private val dish6= Dish(
        "https://www.themealdb.com/images/category/pork.png",
        "Pork",
        "Pork is the culinary name for meat from a domestic pig (Sus scrofa domesticus). It is the most commonly consumed meat worldwide, with evidence of pig husbandry dating back to 5000 BC. Pork is eaten both freshly cooked and preserved.",
        4.8,
        "10 min",
        "150 kcal",
        36.00
    )

    private val dish7= Dish(
        "https://www.themealdb.com/images/category/pasta.png",
        "Pasta",
        "Pasta is a staple food of traditional Italian cuisine, with the first reference dating to 1154 in Sicily.",
        4.1,
        "30 min",
        "150 kcal",
        29.00
    )
    private val dish8= Dish(
        "https://www.themealdb.com/images/category/seafood.png",
        "Seafood",
        "Seafood is any form of sea life regarded as food by humans.",
        3.5,
        "20 min",
        "150 kcal",
        20.00
    )
    private val burger= CtgItem(R.drawable.ctg_burger,"Burger")
    private val pizza= CtgItem(R.drawable.ctg_pizza,"Pizza")
    private val sandwich= CtgItem(R.drawable.ctg_sandwich,"Sandwich")
    private val broccoli= Ingredient("Broccoli",R.drawable.ing_broccoli)
    private val chill= Ingredient("Chill",R.drawable.ing_chill)
    private val corn= Ingredient("Corn",R.drawable.ing_corn)
    private val carrot= Ingredient("Carrot",R.drawable.ing_carrot)

    val ingredientObjects = listOf(broccoli,chill,corn,carrot,broccoli,chill,corn,carrot,broccoli,chill,corn,carrot,broccoli,chill,corn,carrot)
    val ctgObjects = listOf(burger,pizza,sandwich,burger,pizza,sandwich)
    val dishObjects = listOf(dish1,dish2,dish3,dish4,dish5,dish6,dish7,dish8)


}
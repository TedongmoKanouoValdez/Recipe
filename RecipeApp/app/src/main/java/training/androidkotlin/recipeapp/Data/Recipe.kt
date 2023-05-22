package training.androidkotlin.recipeapp.Data

import androidx.annotation.DrawableRes
import training.androidkotlin.recipeapp.R

data class Recipe(
    val title:String,
    val category: String,
    val cookingTime:String,
    val energy: String,
    val rating: String,
    val description: String,
    val reviews: String,
    val ingredients: List<Ingredient>
)
data class Ingredient(@DrawableRes val image:Int,val title: String,val subtitle:String)

val strawberryCake = Recipe(
    title = "Strawberry Cake",
    category = "Desserts",
    cookingTime = "50 min",
    energy = "620 kcal",
    rating = "4,9",
    description = "le burger avec un dessert ainsi que le strawberry cake.",
    reviews = "84 photos     430 comments",
    ingredients = listOf(
        Ingredient(R.drawable.burger, "burger", "450 g"),
        Ingredient(R.drawable.oef, "Eggs", "4"),
        Ingredient(R.drawable.juice, "Lemon juice", "150 g"),
        Ingredient(R.drawable.straw, "Strawberry", "200 g"),
        Ingredient(R.drawable.sucre, "Sugar", "1 cup"),
        Ingredient(R.drawable.legume, "Mind", "20 g"),
        Ingredient(R.drawable.ice, "Vanilla", "1/2 teaspoon"),
    )
)

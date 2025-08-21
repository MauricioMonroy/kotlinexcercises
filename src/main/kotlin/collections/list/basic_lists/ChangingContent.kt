package collections.list.basic_lists

fun main() {
    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    val stars = mutableListOf("Ginan", "Mu Crucis")
    val names = mutableListOf("Jack", "John", "Katie")
    val food = mutableListOf("Bread", "Cheese", "Meat")
    val fruits = mutableListOf("Apple", "Banana", "Grape", "Mango")
    // No matter the keyword, val or var, the list is mutable
    // This is possible because we change the content of the list, not the reference

    southernCross.removeAt(0) // This function removes the element at the specified index
    southernCross.remove("Mimosa") // This function removes the first occurrence of the specified element from the list

    stars.add("New star") // This function adds the specified element to the end of the list
    stars.add(0, "First star") // You can specify the position of the item in the list

    names.clear() // Deletes all elements from the list

    food.addAll(fruits) // This function adds all elements from the specified collection to the end of the list

    println(names) // []
    println(southernCross.joinToString()) // Gacrux, Imai
    println(stars.joinToString()) // First star, Ginan, Mu Crucis, New star
    println(food.joinToString()) // Bread, Cheese, Meat, Apple, Banana, Grape, Mango

}
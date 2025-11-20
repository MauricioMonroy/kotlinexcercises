package types_and_data_structures.collections.list.mutable_list

fun main() {
    // Mutable lists can be created using the mutableListOf function
    // The mutableListOf function creates a mutable list that can be modified
    val places = mutableListOf<String>("Paris", "Moscow", "Tokyo")
    places.add("Saint-Petersburg")
    println(places) // output: [Paris, Moscow, Tokyo, Saint-Petersburg]

    // It is not necessary to specify the type, except if creating an empty list
    val emptyList = mutableListOf<String>()
    emptyList.add("New York")
    println(emptyList) // output: [New York]

    // It is possible to transform a regular list into a mutable one
    val regularList = listOf("Berlin", "London", "Madrid")
    val mutableList = regularList.toMutableList()
    mutableList.add("Rome")
    println(mutableList) // output: [Berlin, London, Madrid, Rome]
}

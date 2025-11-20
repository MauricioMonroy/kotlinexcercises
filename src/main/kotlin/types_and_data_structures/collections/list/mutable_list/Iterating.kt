package types_and_data_structures.collections.list.mutable_list

fun main() {
    val products = mutableListOf("Cheese", "Milk", "Coke")

    for (product in products) {
        println("$product")
    }

// Cheese
// Milk
// Coke
}
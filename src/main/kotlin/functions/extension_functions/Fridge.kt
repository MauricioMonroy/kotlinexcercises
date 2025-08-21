package functions.extension_functions

class Fridge {
    fun open() = println(1)
    fun find(productName: String): Product {
        println(productName)
        return 4
    }

    fun close() = println(3)
}

fun Fridge.take(productName: String): Product {
    open()
    val product = find(productName)
    close()
    return product
}

typealias Product = Int

fun main() {
    val fridge = Fridge()
    println("Enter product name:")
    val product = fridge.take(readln())
    println(product)  // Output: 4
}
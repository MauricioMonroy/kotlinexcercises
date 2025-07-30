package collections.list

fun shelf(products: List<String>, product: String) {
    val index = products.indexOf(product)
    if (index != -1) {
        val indices = products.withIndex().filter { it.value == product }.map { it.index }
        println(indices.joinToString(" "))
    } else {
        println("The product '$product' is not found on the shelf.")
    }
}

fun main() {
    val products = readln().split(" ")
    val productToCheck = readln()
    shelf(products, productToCheck)
}
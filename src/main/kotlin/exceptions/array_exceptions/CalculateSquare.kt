package exceptions.array_exceptions

fun calculateSquare(array: IntArray?, index: Int) {
    try {
        val value = array?.get(index) ?: throw NullPointerException("Exception!")
        val square = value * value
        println(square)
    } catch (e: NullPointerException) {
        println("Exception!")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Exception!")
    }
}

fun main() {
    val array: IntArray? = intArrayOf(1, 2, 3, 4, 5)
    calculateSquare(array, 2) // Should print: The square of the element at index 2 is 9
    calculateSquare(array, 5) // Should print: Exception!
    calculateSquare(null, 0)  // Should print: Array is null
}
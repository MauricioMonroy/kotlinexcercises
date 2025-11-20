package types_and_data_structures.collections.list.multi_dimensional_list

// Two-dimensional list example
val mutList2D = mutableListOf(
    mutableListOf<Int>(0, 1, 2, 3),
    mutableListOf<Int>(4, 5, 6, 7, 8),
    mutableListOf<Int>(9, 10, 11, 12, 13, 14)
)

// Accessing elements
val element1 = mutList2D[0][2] // Accessing the element '2' from the first row
val element2 = mutList2D[1][4] // Accessing the element '8' from the second row

// List with different types of elements
val mixedList2D = mutableListOf(
    mutableListOf<Any>(1, "two", 3.0),
    mutableListOf<Any>("four", 5, 6.7),
    mutableListOf<Any>(7.8, "eight", 9)
)

// List of strings as a 2D list using the joinToString() function
val mutListString = mutableListOf(
    mutableListOf<String>("A", "R", "R", "A", "Y")
)


fun main() {
    println("Element at mutList2D[0][2]: $element1")
    println("Element at mutList2D[1][4]: $element2")
    println("Mixed List 2D: $mixedList2D")
    print(mutListString[0].joinToString())    // A, R, R, A, Y
}
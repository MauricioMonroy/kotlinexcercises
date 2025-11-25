package types_and_data_structures.arrays.multi_dimensional_arrays

fun main() {
    // 2-dimensional array initialization
    val array2D = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    // Accessing elements
    println("Element at (0,0): ${array2D[0][0]}") // Output: 1
    println("Element at (1,2): ${array2D[1][2]}") // Output: 6

    // Iterating through the 2D array
    for (i in array2D.indices) {
        for (j in array2D[i].indices) {
            print("${array2D[i][j]} ")
        }
        println()
    }

    // Nested arrays with different types
    val arrayOfString2D = arrayOf(
        arrayOf("Practice", "Makes", "Perfect"),
        arrayOf(1, 2)
    )
    for (i in arrayOfString2D.indices) {
        for (j in arrayOfString2D[i].indices) {
            print("${arrayOfString2D[i][j]} ")
        }
        println()
    }

    // Converting to a string
    val arrayString = arrayOf(
        arrayOf("A", "R", "R", "A", "Y")
    )
    println(arrayString[0].joinToString())    // A, R, R, A, Y

    // Deep conversion to string: useful to get all elements in multidimensional arrays in a single string
    val arrayOfChar2D = arrayOf(
        charArrayOf('k'),
        charArrayOf('o', 't'),
        charArrayOf('l', 'i', 'n')
    )
    println(arrayOfChar2D.contentDeepToString())    // [[k], [o, t], [l, i, n]]

    // >2-dimensional array
    val array3D = arrayOf(
        arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9)),
        arrayOf(arrayOf(10, 11, 12), arrayOf(13, 14, 15), arrayOf(16, 17, 18)),
        arrayOf(arrayOf(19, 20, 21), arrayOf(22, 23, 24), arrayOf(25, 26, 27))
    )
    println(array3D[1][1][1]) // Output: 14
    println(array3D[2][2]) // Output: [25, 26, 27]
    println(array3D.contentDeepToString())
    println(array3D[3][2]) // Error: Index out of bounds
}
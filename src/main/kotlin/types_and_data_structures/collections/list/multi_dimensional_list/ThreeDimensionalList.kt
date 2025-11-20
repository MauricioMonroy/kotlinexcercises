package types_and_data_structures.collections.list.multi_dimensional_list

val mutList3D = mutableListOf(
    mutableListOf(
        mutableListOf(1, 2, 3),
        mutableListOf(4, 5, 6),
        mutableListOf(7, 8, 9)
    ),
    mutableListOf(
        mutableListOf(10, 11, 12),
        mutableListOf(13, 14, 15),
        mutableListOf(16, 17, 18)
    ),
    mutableListOf(
        mutableListOf(19, 20, 21),
        mutableListOf(22, 23, 24),
        mutableListOf(25, 26, 27)
    )
)

fun main() {
    // Accessing an element
    println("Element at [1][2][0]: ${mutList3D[1][2][0]}") // 16

    // Modifying an element
    mutList3D[0][0][0] = 99
    println("Modified Element at [0][0][0]: ${mutList3D[0][0][0]}") // 99

    // Iterating through the 3D list
    for (i in mutList3D.indices) {
        for (j in mutList3D[i].indices) {
            for (k in mutList3D[i][j].indices) {
                print("${mutList3D[i][j][k]} ")
            }
            println()
        }
        println()
    }
}
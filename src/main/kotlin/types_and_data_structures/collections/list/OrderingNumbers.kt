package types_and_data_structures.collections.list

fun main() {
    println("Enter the number of elements:")
    val size = readln().toInt()
    println("Enter the elements (write one number per line):")
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until size) {
        mutList.add(readln().toInt())
    }

    for (i in mutList.lastIndex downTo 0) {
        print("${mutList[i]} ")
    }
}
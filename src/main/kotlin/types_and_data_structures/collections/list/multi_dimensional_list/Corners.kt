package types_and_data_structures.collections.list.multi_dimensional_list

fun main() {
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(" ").toMutableList()
        inputList.add(strings)
    }
    val corners = listOf(
        inputList[0][0],
        inputList[0][n - 1],
        inputList[n - 1][0],
        inputList[n - 1][n - 1]
    )
    for (i in corners.indices step 2) {
        println("${corners[i]} ${corners[i + 1]}")
    }
}
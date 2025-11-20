package types_and_data_structures.collections.list.multi_dimensional_list

fun main() {
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val stringsList = readln().split(" ").toMutableList()
        inputList.add(stringsList)
    }
    println(inputList[2].joinToString(", "))

}
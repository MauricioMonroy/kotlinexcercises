package types_and_data_structures.collections.list.multi_dimensional_list

fun main() {
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readln().toInt()
    for (i in 0 until n) {
        val strings = readln().split(' ').toMutableList()
        inputList.add(strings)
    }
    val resultList = mutableListOf<MutableList<String>>()
    resultList.add(inputList.last().toMutableList())
    resultList.add(inputList.first().toMutableList())
    println(resultList)
//    val mutList3D = mutableListOf(
//        mutableListOf(mutableListOf(0, 1), mutableListOf(2)),
//        mutableListOf(mutableListOf(4, 5, 6, 7), mutableListOf(8, 9)),
//        mutableListOf(mutableListOf(10, 11), mutableListOf(12)),
//        mutableListOf(mutableListOf(13, 14, 15), mutableListOf(16, 17, 18))
//    )
//
//    println(mutList3D.size)
//    println(mutList3D.first().size)
//    println(mutList3D[mutList3D.size - 1].last())
//    println(mutList3D.first().last().size)
}
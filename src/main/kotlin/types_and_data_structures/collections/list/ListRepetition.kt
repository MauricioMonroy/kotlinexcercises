package types_and_data_structures.collections.list

fun solving(names: List<String>): Int {
    for (i in 1 until names.size step 2) {
        if (names[i].startsWith('T')) {
            return i
        }
    }
    return 0
}

fun main() {
    val names = readln().split(" ")
    println(solving(names))
}

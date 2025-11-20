package types_and_data_structures.collections.list.mutable_list

fun changeToBanana(strings: MutableList<String>, str: String): MutableList<String> {
    val banana = "Banana"
    for (i in strings.indices) {
        if (strings[i] == str) {
            strings[i] = banana
        }
    }
    return strings
}

fun main() {
    val input = readln().split(" ").toMutableList()
    val str = readln()
    val result = changeToBanana(input, str)
    println(result.joinToString(" "))
}
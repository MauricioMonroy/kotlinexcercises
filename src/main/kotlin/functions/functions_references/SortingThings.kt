package functions.functions_references

fun main() {
    fun min(a: Int, b: Int) = if (a < b) a else b
    fun max(a: Int, b: Int) = if (a > b) a else b

    println("Enter 'ascending' or 'descending':")
    val isAscending: Boolean = readln() == "ascending"
    println("Enter numbers separated by space:")
    val list: MutableList<Int> = readln().split(' ').map { it.toInt() }.toMutableList()

    val comparator: (Int, Int) -> Int = if (isAscending) ::min else ::max
    sort(list, comparator)
    list.forEach { e -> print("$e ") }
}

fun sort(array: MutableList<Int>, comparator: (Int, Int) -> Int) {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - i - 1) {
            if (comparator(array[j], array[j + 1]) == array[j + 1]) {
                array[j] = array[j + 1].also { array[j + 1] = array[j] }
            }
        }
    }
}
package collections.list.basic_lists

fun main() {
    // Checking if a list is empty
    val list = mutableListOf<String>()
    println(list.isEmpty()) // true
    println(list.isNotEmpty()) // false

    // Creating a smaller list or sublist
    val list2 = mutableListOf("A", "B", "C", "D", "E")
    var subList = mutableListOf<String>()
    if (list2.isNotEmpty() && list2.size >= 4) {
        subList = list2.subList(1, 4)
    }
    print(subList) // [B, C, D]

    // Searching for the index of an element
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    if (5 in list3) {
        println(list3.indexOf(5)) // 4
    }
    print(list3.indexOf(7)) // -1, because 7 is not in the list

    // Searching for the minimum and maximum values
    val list4 = mutableListOf(1, 2, 3, 4, 5)
    println(list4.minOrNull()) // 1
    println(list4.maxOrNull()) // 5

    // Reversing a list
    val list5 = mutableListOf(1, 2, 3, 4, 5)
    val reversedList = list5.reversed()
    println(reversedList) // [5, 4, 3, 2, 1]

    // Summing a list
    val list6 = mutableListOf(1, 2, 3, 4, 5)
    val sum = list6.sum()
    println(sum) // 15

    // Sorting a list
    val list7 = mutableListOf(5, 3, 1, 4, 2)
    list7.sort()
    println(list7) // [1, 2, 3, 4, 5]
    // Sorting a list in descending order
    list7.sortDescending()
    println(list7) // [5, 4, 3, 2, 1]

    // Conclusion
    //    * use joinToString() to create a single string from the list and output it;
    //    * use == and != to compare two mutable lists;
    //    * add new elements to a list or remove elements from it;
    //    * perform various manipulations on lists and list elements.

}
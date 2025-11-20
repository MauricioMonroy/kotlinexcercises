package types_and_data_structures.collections.list.mutable_list

fun main() {
    // add(element) method
    val mutableList = mutableListOf("apple", "banana", "cherry")
    mutableList.add("date")
    println(mutableList) // Output: [apple, banana, cherry, date]

    // set(index, element) method
    mutableList[1] = "blueberry"
    println(mutableList) // Output: [apple, blueberry, cherry, date]

    // addAll(elements) method
    mutableList.addAll(listOf("elderberry", "fig"))
    println(mutableList) // Output: [apple, blueberry, cherry, date, elderberry, fig]
}

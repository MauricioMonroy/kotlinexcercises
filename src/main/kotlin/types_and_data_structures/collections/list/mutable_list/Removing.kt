package types_and_data_structures.collections.list.mutable_list

fun main() {
    // removeAt(index) removes the element at the specified index from the list
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    println("Original list: $numbers")
    numbers.removeAt(2) // Removes the element at index 2 (which is 3)
    println("List after removing element at index 2: $numbers")

    // remove(element) removes the first occurrence of the specified element from the list
    val fruits = mutableListOf("apple", "banana", "cherry", "banana", "date")
    println("Original list: $fruits")
    fruits.remove("banana") // Removes the first occurrence of "banana"
    println("List after removing 'banana': $fruits")

    // clear() removes all elements from the list
    val colors = mutableListOf("red", "green", "blue")
    println("Original list: $colors")
    colors.clear() // Removes all elements from the list
    println("List after clearing: $colors")

    // removeAll(elements) removes all occurrences of the specified elements from the list
    val numbersToRemove = listOf(1, 2, 3)
    val numbersList = mutableListOf(1, 2, 3, 4, 5, 1, 2, 3)
    println("Original list: $numbersList")
    numbersList.removeAll(numbersToRemove) // Removes all occurrences of 1, 2, and 3
    println("List after removing 1, 2, and 3: $numbersList")

    // removeIf(predicate) removes all elements that match the given predicate
    val evenNumbers = mutableListOf(1, 2, 3, 4, 5, 6)
    println("Original list: $evenNumbers")
    evenNumbers.removeIf { it % 2 == 0 } // Removes all even numbers
    println("List after removing even numbers: $evenNumbers")
}
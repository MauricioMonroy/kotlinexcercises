package arrays.string_arrays

fun main() {
    // Initialization for any type of array
    val strings = arrayOf("array", "of", "strings")

    // Initialization for a specific type String
    val stringArray = arrayOf<String>("array", "of", "strings")

    // Empty array of String type
    val emptyArray = emptyArray<String>()

    // Accessing elements
    println(strings[0]) // Output: array
    println(strings.get(1)) // Output: of
    println(strings.size) // Output: 3
    println(stringArray.last()) // Output: types_and_data_structures.strings
    println(emptyArray.size) // Output: 0
    println(strings.lastIndex) // Output: 2
    println(strings.joinToString(" ")) // Output: array of types_and_data_structures.strings

    // Adding elements (creates a new array)
    val newArray = strings + "new"
    println(newArray.joinToString(" ")) // Output: array of types_and_data_structures.strings new

    // Modifying elements (creates a new array)
    val modifiedArray = strings.copyOf()
    modifiedArray[1] = "modified"
    println(modifiedArray.joinToString(" ")) // Output: array modified types_and_data_structures.strings

    // Iterating over elements
    for (str in strings) {
        print("$str ") // Output: array of types_and_data_structures.strings
    }
    println()
    strings.forEach { print("$it ") } // Output: array of types_and_data_structures.strings
    println()
    strings.forEachIndexed { index, value -> println("Index $index: $value") }
    // Output:
    // Index 0: array
    // Index 1: of
    // Index 2: types_and_data_structures.strings

    // Searching for elements
    println(strings.contains("of")) // Output: true
    println("of" in strings) // Output: true
    println(strings.indexOf("strings")) // Output: 2
    println(strings.indexOf("missing")) // Output: -1
    println(strings.lastIndexOf("array")) // Output: 0
    println(strings.lastIndexOf("missing")) // Output: -1

    // Comparing arrays
    val anotherArray = arrayOf("array", "of", "strings")
    println(strings == anotherArray) // Output: false (reference comparison)
    println(strings === anotherArray) // Output: false (reference comparison)
    println(strings.contentEquals(anotherArray)) // Output: true (content comparison)
    println(strings.contentDeepEquals(anotherArray)) // Output: true (deep content comparison)
}
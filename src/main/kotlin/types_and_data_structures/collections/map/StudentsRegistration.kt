package types_and_data_structures.collections.map

fun main() {
    val students = mapOf(
        "Alice" to 8,
        "Bob" to 6,
        "Charlie" to 9,
        "Diana" to 5
    )
    println(students)
    // Output: {Alice=8, Bob=6, Charlie=9, Diana=5}

    val grade = students["Alice"]
    println("Alice's grade is: $grade")
    // Output: Alice's grade is: 8

    // Map element
    val (name, gradeValue) = Pair("Pepe", 7)
    println("Student name is: $name, amd their grade is: $gradeValue")
    // Output: Student name is: Pepe, amd their grade is: 7

    // Map element with destructuring declaration
    val p = Pair(9, 7)
    println("${p.first} ${p.second}") // Output: 9 7
    val (first, second) = p
    println("$first $second") // Output: 9 7
}
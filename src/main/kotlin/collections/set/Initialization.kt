package collections.set

val humanLanguages = setOf<String>("English", "Spanish", "French") // immutable set of human languages
val languages = setOf("Java", "Kotlin", "Python") // immutable set of programming languages
val numbers = emptySet<Int>() // empty immutable set of integers
val letters = setOf<Char>('A', 'B', 'C') // immutable set of types_and_data_structures.characters
val set = buildSet<Char> {
    add('D')
    addAll(letters)
    add('E')
} // buildSet creates a mutable set and returns it as an immutable set

fun main() {
    println(humanLanguages) // Output: [English, Spanish, French]
    println(languages) // Output: [Java, Kotlin, Python]
    println(numbers) // Output: []
    println(letters) // Output: [A, B, C]
    println(set) // Output: [D, A, B, C, E]
    // Note: The order of elements in a set is not guaranteed, so the output may
    // vary in terms of the order of elements.
    // However, the elements themselves will always be the same.
    // For example, the output could also be: [A, B, C, D, E] or [E, D, A, B, C] etc.
    // The important thing is that all elements are present and no duplicates exist.
}

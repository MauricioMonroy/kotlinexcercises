package collections.set.mutable_set

// Without specify the type, Kotlin will infer the type as String
val students = mutableSetOf("Isabel", "John", "Alice")

// If the MutableSet is empty we can specify the type explicitly
val points = mutableSetOf<Int>()

// Is posible transform a Set into a MutableSet
val setOfNumbers: Set<Int> = setOf(1, 2, 3, 4, 5)
val mutableSetOfNumbers: MutableSet<Int> = setOfNumbers.toMutableSet()

fun main() {
    // Printing the mutable set of students
    println(students) // Output: [Isabel, John, Alice]

    // Adding a new student
    students.add("Bob")
    println(students) // Output: [Isabel, John, Alice, Bob]

    // Adding all students from another set
    val newStudents = setOf("Charlie", "David")
    students.addAll(newStudents)
    println(students) // Output: [Isabel, John, Alice, Bob, Charlie, David]

    // Removing a student
    students.remove("John")
    println(students) // Output: [Isabel, Alice, Bob]

    // Clearing the mutable set of students
    students.clear()
    // Or use removeAll method. But this method is more useful when you want to remove specific elements
    // students.removeAll(students)
    println(students) // Output: []

    // Printing the mutable set of points
    println(points) // Output: []

    // Adding points to the mutable set
    points.add(10)
    points.add(20)
    println(points) // Output: [10, 20]

    // Printing the mutable set of numbers
    println(mutableSetOfNumbers) // Output: [1, 2, 3, 4, 5]
}
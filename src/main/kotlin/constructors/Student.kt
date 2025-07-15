package constructors

class Student(val name: String, val age: Int) {
    init {
        if (age < 18) println("Age must be at least 18")
        else println("Student $name is $age years old")
    }
}

fun main() {
    val student1 = Student("Alice", 20)
    val student2 = Student("Bob", 17) // This will trigger the age validation
    val student3 = Student("Charlie", 22)
}
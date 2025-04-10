package objects

fun main() {
    val a = "test"
    var b = a
    b = "a"
    //val a = "a"
    print(a)
    print(", ")
    print(b)
}

// This demostrate the concept of immutability in Kotlin.
// In Kotlin, variables declared with 'val' are immutable, meaning their values cannot be changed after they are assigned.
// The output results in conflict because 'a' is declared twice in the same scope.
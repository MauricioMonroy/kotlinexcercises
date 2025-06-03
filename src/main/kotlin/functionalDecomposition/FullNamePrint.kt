package functionalDecomposition

fun createFullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}
fun printFullName(fullName: String) {
    println(fullName)
}
fun main() {
    val firstName = readln()
    val lastName = readln()

    val fullName = createFullName(firstName, lastName)
    printFullName(fullName)
}
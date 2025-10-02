package strings.processing_strings

fun main() {
    println("Write a name of a scientist:")
    val scientist = readln()

    for (i in 0 until scientist.length) {
        print("${scientist[i]} ")
    }
}
package loops

fun main() {
    for (i in 'z' downTo 'e' step 20) {
        println(i)
    }
    for (num in 1..<5) println(num)
    for (num in 1..5) println(num)
    for (num in 5 downTo 1) println(num)
    for (num in 1 until 6) println(num)
    for (num in 1..5 step 1) println(num)
}
package strings

fun main() {
    val input = readln()
    val isPieceOfAlphabet = input.zipWithNext().all { (a, b) -> b == a + 1 }
    println(if (isPieceOfAlphabet) "true" else "false")
}
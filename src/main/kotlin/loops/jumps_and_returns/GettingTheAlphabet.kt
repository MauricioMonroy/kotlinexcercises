package loops.jumps_and_returns

fun main() {
    val inputLetter = readln()
    val alphabet = ('a'..'z').toList()
    for (letter in alphabet) {
        if (letter in inputLetter) {
            break
        }
        print(letter)
    }
}
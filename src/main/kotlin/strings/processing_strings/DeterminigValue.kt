package strings.processing_strings

fun main() {
    val chars = charArrayOf('a', 'b', 'c', '-', 'd', 'e', 'f')
    val stringFromChars =String(chars)
    val strings = stringFromChars.split("-")
    for (s in strings) {
        println(s)
    }
//    println(strings[0]) // "abc"
//    println(strings[1]) // "def"
}
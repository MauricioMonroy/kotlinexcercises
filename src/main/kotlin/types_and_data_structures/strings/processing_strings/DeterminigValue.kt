package types_and_data_structures.strings.processing_strings

fun main() {
    val chars = charArrayOf('a', 'b', 'c', '-', 'd', 'e', 'f')
    val stringFromChars =String(chars)
    val strings = stringFromChars.split("-")
    for (s in strings) {
        println(s)
    }
//    println(types_and_data_structures.strings[0]) // "abc"
//    println(types_and_data_structures.strings[1]) // "def"
}
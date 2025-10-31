package types_and_data_structures.strings.processing_strings

fun main() {
    val sentence = readln()
    val wordList: List<String> = sentence.split(" ") // The space " " is the delimiter here
    val mutableList = sentence.split("-").toMutableList() // The sign "-" is the delimiter here
    println(wordList)
    println(mutableList)
}
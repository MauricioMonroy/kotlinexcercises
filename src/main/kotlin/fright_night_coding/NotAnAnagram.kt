package fright_night_coding

fun main() {
    val strings = readln().split(' ')
    val sortedStrings = strings.map { it.toCharArray().sorted().joinToString("") }
    val anagramMap = mutableMapOf<String, Int>()
    for (sorted in sortedStrings) {
        anagramMap[sorted] = anagramMap.getOrDefault(sorted, 0) + 1
    }
    val nonAnagramSorted = anagramMap.entries.first { it.value == 1 }.key
    val index = sortedStrings.indexOf(nonAnagramSorted)
    println(strings[index])
}
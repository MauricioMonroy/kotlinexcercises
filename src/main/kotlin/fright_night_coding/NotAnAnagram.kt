package fright_night_coding

/*
* This program reads a list of strings and identifies the one that is not an anagram of the others.
* It does this by sorting the characters of each string and counting occurrences of each sorted version.
* The string that corresponds to the unique sorted version is printed as the output.
* Example:
* Input: "listen silent enlist inlets google"
* Output: "google"
*/

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
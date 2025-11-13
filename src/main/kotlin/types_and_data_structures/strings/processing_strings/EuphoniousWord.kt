package types_and_data_structures.strings.processing_strings

fun main() {
    val word = readln()
    val vowels = "aeiouyAEIOUY"
    var insertions = 0

    var prevIsVowel: Boolean? = null
    var runLength = 0

    for (ch in word) {
        if (!ch.isLetter()) continue
        val isVowel = vowels.contains(ch)
        if (prevIsVowel == null || isVowel != prevIsVowel) {
            if (runLength > 0) {
                insertions += (runLength - 1) / 2
            }
            runLength = 1
            prevIsVowel = isVowel
        } else {
            runLength++
        }
    }

    if (runLength > 0) insertions += (runLength - 1) / 2

    println(insertions)
}
package types_and_data_structures.characters

fun main() {
    val dataset = readln()
    val allNotes = setOf('A', 'B', 'C', 'D', 'E', 'F', 'G')
    var shortestSequence: String? = null
    for (start in dataset.indices) {
        for (end in start + 1..dataset.length) {
            val substring = dataset.substring(start, end)
            if (allNotes.all { it in substring }) {
                if (shortestSequence == null || substring.length < shortestSequence.length) {
                    shortestSequence = substring
                }
            }
        }
    }
    if (shortestSequence != null) {
        println(shortestSequence)
    } else {
        println("No sequence contains all notes A to G.")
    }
}
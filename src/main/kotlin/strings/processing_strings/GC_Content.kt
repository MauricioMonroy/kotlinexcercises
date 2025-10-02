package strings.processing_strings

fun main() {
    val dna = readln()
    val gcCount = dna.count { it.uppercaseChar() in "GC" }
    val gcContent = (gcCount.toDouble() / dna.length) * 100
    println(gcContent)
}

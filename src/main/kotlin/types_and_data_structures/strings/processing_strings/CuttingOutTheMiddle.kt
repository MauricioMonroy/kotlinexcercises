package types_and_data_structures.strings.processing_strings

fun main() = println(
    readln().let { s ->
        val i = s.length / 2
        s.removeRange(if (s.length % 2 == 0) i - 1 else i, i + 1)
    }
)
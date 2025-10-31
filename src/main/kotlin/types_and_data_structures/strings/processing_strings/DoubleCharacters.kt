package types_and_data_structures.strings.processing_strings

fun main() = println(readln().flatMap { listOf(it, it) }.joinToString(""))

// It can also be done like this:
// fun main() = println(readln().map { "$it$it" }.joinToString(""))

// Or like this:
// fun main() = println(buildString {
//     readln().forEach { append(it).append(it) }
// })

// Or like this:
// fun main() = println(readln().flatMap { c -> sequenceOf(c, c) }.joinToString(""))

// Or like this:
// fun main() = println(readln().fold("") { acc, c -> acc + c + c })

// Or like this:
// fun main() = println(readln().replace(Regex("(.)"), "$1$1"))

// Or like this:
// fun main() = println(readln().replace(Regex(".")) { "${it.value}${it.value}" })

// Or like this:
// fun main() = println(readln().replace(Regex(".")) { it.value.repeat(2) })

// Or like this:
// fun main() = println(readln().flatMap { listOf(it, it) }.toCharArray().concatToString())

// Or like this:
// fun main() = println(readln().toCharArray().joinToString("") { "$it$it" })

// Or like this:
// fun main() = println(readln().toCharArray().fold("") { acc, c -> acc + c + c })

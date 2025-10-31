package types_and_data_structures.strings.processing_strings

import kotlin.random.Random

fun main() {
    // Using a try-catch block to handle potential input errors
    try {
        // Read and parse input: upper, lower, digit counts and total length
        val input = readln().split(" ").map { it.toInt() }

        // Validate input
        if (input.size != 4) throw IllegalArgumentException("Input must contain exactly four numbers: upper lower digit totalLength")
        val (upperCount, lowerCount, digitCount, totalLength) = input
        if (upperCount < 0 || lowerCount < 0 || digitCount < 0 || totalLength < 1)
            throw IllegalArgumentException("Counts must be non-negative and totalLength at least 1")
        if (upperCount + lowerCount + digitCount > totalLength)
            throw IllegalArgumentException("Sum of character counts exceeds total length")

        // Character pools, i.e., uppercase, lowercase, digits shuffled
        val pools = arrayOf(
            ('A'..'Z').toList().shuffled(Random),
            ('a'..'z').toList().shuffled(Random),
            ('0'..'9').toList().shuffled(Random)
        )

        // Counts and indices to track usage
        val counts = arrayOf(upperCount, lowerCount, digitCount)
        val indices = arrayOf(0, 0, 0)
        val result = StringBuilder()
        var lastType = -1

        // Add required counts, i.e., ensure at least the specified number of each type
        while (counts.sum() > 0) {
            val available = (0..2).filter { counts[it] > 0 && it != lastType }
            val type = if (available.isNotEmpty()) available.random(Random)
            else (0..2).filter { counts[it] > 0 }.random(Random)
            result.append(pools[type][indices[type] % pools[type].size])
            indices[type]++
            counts[type]--
            lastType = type
        }
        // Fill remaining, ensuring no two consecutive types_and_data_structures.characters are of the same type
        while (result.length < totalLength) {
            val fillTypes = (0..2).filter { it != lastType }
            val type = fillTypes.random(Random)
            result.append(pools[type][indices[type] % pools[type].size])
            indices[type]++
            lastType = type
        }
        println(result)
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}





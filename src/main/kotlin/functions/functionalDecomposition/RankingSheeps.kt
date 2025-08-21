package functions.functionalDecomposition

fun calculateRank(weight: Int): Int {
    return when {
        weight < 30 -> 1
        weight in 30..50 - 1 -> 2
        weight in 50..70 - 1 -> 3
        weight > 70 -> 4
        else -> 4
    }
}

fun main() {
    val sheepWeights = readln().split(" ").map { it.toInt() }
    val sheepRanks = sheepWeights.map { calculateRank(it) }
    println(sheepRanks.joinToString(" "))
}
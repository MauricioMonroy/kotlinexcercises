package loops.jumps_and_returns

fun main() {
    val occupiedPositions = mutableSetOf<Pair<Int, Int>>()
    repeat(3) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        occupiedPositions.add(Pair(x, y))
    }
    val availableRows = mutableSetOf(1, 2, 3, 4, 5)
    val availableCols = mutableSetOf(1, 2, 3, 4, 5)
    for ((x, y) in occupiedPositions) {
        availableRows.remove(x)
        availableCols.remove(y)
    }
    println(availableRows.sorted().joinToString(" "))
    println(availableCols.sorted().joinToString(" "))
}
package fright_night_coding

fun main() {
    val matrix = arrayOf(
        "A B C D".split(" "),
        "E F G H".split(" "),
        "I J K L".split(" "),
        "M N O P".split(" ")
    )
    val maxRow = matrix.lastIndex
    val maxCol = matrix[0].lastIndex

    while (true) {
        val line = readln() ?: break // EOF -> terminate
        var row = 0
        var col = 0
        val moves = line.split(",").map { it.trim() }.filter { it.isNotEmpty() }
        for (move in moves) {
            when (move.uppercase()) {
                "UP" -> if (row > 0) row--
                "DOWN" -> if (row < maxRow) row++
                "LEFT" -> if (col > 0) col--
                "RIGHT" -> if (col < maxCol) col++
            }
        }
        print(matrix[row][col])
    }
}
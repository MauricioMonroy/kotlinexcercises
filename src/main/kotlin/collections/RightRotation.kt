package collections

fun main() {
    val n = readln().toInt()
    val numbers = mutableListOf<Int>()
    repeat(n) {
        numbers.add(readln().toInt())
    }
    val rotatePositions = readln().toInt()
    val rotatedList = rotatePositions % n
    val optimizedRotation = numbers.takeLast(rotatedList) + numbers.dropLast(rotatedList)
    println(optimizedRotation.joinToString(" "))
}

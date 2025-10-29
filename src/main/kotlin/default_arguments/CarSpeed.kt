package default_arguments

fun checkSpeed(speed: Int, limit: Int = 60) {
    val subtracted = speed - limit
    if (subtracted > 0) {
        print("Exceeds the limit by $subtracted kilometers per hour")
    } else {
        print("Within the limit")
    }
}

fun main() {
    val speed = readln().toInt()
    val limit = readln().let { input ->
        if (input == "no limit") 60 else input.toInt()
    }
    checkSpeed(speed, limit)
}

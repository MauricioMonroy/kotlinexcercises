package constructors

class ByteTimer(var time: Int) {
    init {
        time = if (time < -128) {
            -128
        } else if (time > 127) {
            127
        } else {
            time.toByte().toInt()
        }
    }
}

fun main() {
    val timerValue = readln().toInt()
    val timer = ByteTimer(timerValue)
    print(timer.time)
}
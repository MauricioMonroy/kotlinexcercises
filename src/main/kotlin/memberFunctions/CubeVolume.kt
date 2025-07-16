package memberFunctions

class Box(var height: Double, var width: Double, var length: Double) {
    fun getVolume(): Double {
        return height * width * length
    }
}

fun main() {
    val heightInput = readLine()?.toDoubleOrNull() ?: 0.0
    val widthInput = readLine()?.toDoubleOrNull() ?: 0.0
    val lengthInput = readLine()?.toDoubleOrNull() ?: 0.0
    val box = Box(heightInput, widthInput, lengthInput)
    println("Volume of the box: ${box.getVolume()}")
}
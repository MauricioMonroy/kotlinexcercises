package exceptions

fun intDivision(a: String, b: String): Int {
    try {
        val num1 = a.toInt()
        val num2 = b.toInt()
        return num1 / num2
    } catch (e: NumberFormatException) {
        println("Read values are not integers.")
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
    }
    return 0
}

fun main() {
    val a = readln()
    val b = readln()
    val result = intDivision(a, b)
    println(result)
}
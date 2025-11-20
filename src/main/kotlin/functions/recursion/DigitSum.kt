package functions.recursion

fun digitSum(n: Int): Int {
    return if (n == 0) 0 else n % 10 + digitSum(n / 10)
}

fun main() {
    val number = readln().toInt()
    val result = digitSum(number)
    println(result)
}
package functions.functions_references

fun addition(x: Int, y: Int) = x + y

fun subtract(x: Int, y: Int) = x - y

fun divide(x: Int, y: Int) = x / y

fun product(x: Int, y: Int) = x * y

fun calculate(x: Int, y: Int, operator: (Int, Int) -> Int) {
    val result = operator(x, y)
    print(result)
}

fun main() {
    val x: Int = readln().toInt()
    val y: Int = readln().toInt()
    val operator: String = readln()
    when (operator) {
        "addition" -> calculate(x, y, ::addition)
        "subtract" -> calculate(x, y, ::subtract)
        "divide" -> calculate(x, y, ::divide)
        "product" -> calculate(x, y, ::product)
    }
}
package defaultArguments

fun polynomial(x: Int, c: Int, b: Int, a: Int): Int {
    return if (a == 0 && b == 0) {
        c
    } else if (a == 0) {
        b * x + c
    } else {
        a * x * x + b * x + c
    }
}

fun main() {
    println("Enter the coefficients a, b, c (default is 0 for missing values):")
    val input = readln()
    val coefficients = input.split(" ").map { it.toIntOrNull() ?: 0 }

    val result = polynomial(
        x = 1, // Assuming x is always 1 for evaluation
        c = coefficients.getOrNull(2) ?: 0,
        b = coefficients.getOrNull(1) ?: 0,
        a = coefficients.getOrNull(0) ?: 0
    )

    println(result)
}
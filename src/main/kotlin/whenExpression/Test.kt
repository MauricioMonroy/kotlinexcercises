package whenExpression

fun main() {
    val a = 10
    val b = 11
    when {
        a < 2 -> print(1)
        b > 3 -> print(2)
        a < b -> print(3)
    }
}

// In this code, only print(2) will be executed because the condition `b > 3` is true.
// The other conditions are not checked once a true condition is found in a when expression without an argument.
package functions.recursion

fun f(n: Int): Int = if (n > 2) f(n - 1) + f(n - 2) + f(n - 3) else n

fun main() {
    val number = readln().toInt()
    val result = f(number)
    println(result)
}

// if f(6) is called, the calls will unfold as follows:
// f(6) = f(5) + f(4) + f(3)
// f(5) = f(4) + f(3) + f(2)
// f(4) = f(3) + f(2) + f(1)
// f(3) = f(2) + f(1) + f(0)
// f(2) = 2
// f(1) = 1
// f(0) = 0
// So, substituting back up the chain:
// f(3) = 2 + 1 + 0 = 3
// f(4) = 3 + 2 + 1 = 6
// f(5) = 6 + 3 + 2 = 11
// f(6) = 11 + 6 + 3 = 20
// Therefore, f(6) returns 20.
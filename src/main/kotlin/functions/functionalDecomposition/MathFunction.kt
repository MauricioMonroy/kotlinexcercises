package functions.functionalDecomposition

fun f(x: Double): Double {
    // call your implemented functions here
    return when {
        x <= 0 -> f1(x)
        x > 0 && x < 1 -> f2(x)
        else -> f3(x)
    }
}

// implement your functions here
fun f1(x: Double): Double {
    // implementation for f1 -> if x <= 0
    return if (x <= 0) {
        x * x + 1
    } else {
        x
    }
}

fun f2(x: Double): Double {
    // implementation for f2 -> if 0 < x < 1
    return if (x > 0 && x < 1) {
        1 / (x * x)
    } else {
        x
    }
}

fun f3(x: Double): Double {
    // implementation for f3 -> if x >= 1
    return if (x >= 1) {
        x * x - 1
    } else {
        x
    }
}

fun main() {
    println("Enter a number:")
    val input = readln().toDoubleOrNull()
    if (input != null) {
        val result = f(input)
        println("Result: $result")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}
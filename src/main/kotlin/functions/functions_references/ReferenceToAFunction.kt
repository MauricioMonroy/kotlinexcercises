package functions.functions_references

// This reference has the following declaration:
// ::functionName

fun multiply(x: Int, y: Int) = x * y

fun add(x: Int, y: Int) = x + y

fun main() {
    val operatorMultiply: (Int, Int) -> Int = ::multiply
    val operatorAdd: (Int, Int) -> Int = ::add
    operatorMultiply(2, 3) // Output: 6
    operatorAdd(2, 3) // Output: 5
}


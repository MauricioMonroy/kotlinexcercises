package functions.functions_references

// Functions references allows you to refer to functions by their names without invoking them.
// This is useful for passing functions as parameters or storing them in variables.
// We can do the same using lambda expressions, but function references are more concise and readable.
fun isOdd(x: Int) = x % 2 != 0

fun isEven(x: Int) = x % 2 == 0

fun printNumbers(numbers: MutableList<Int>, filter: (Int) -> Boolean) {
    for (number in numbers) {
        if (filter(number))
            print("$number ")
    }
}

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddFunction = ::isOdd
    print("Odd numbers: ")
    printNumbers(numbers, oddFunction)
    print("\nEven numbers: ")
    printNumbers(numbers, ::isEven)
}

// In this example, we define two functions `isOdd` and `isEven` that check if a number is odd or even.
// We then define a function `printNumbers` that takes a list of numbers and a filter function as parameters.
// Inside `printNumbers`, we iterate through the list and apply the filter function to each number.
// In the `main` function, we create a list of numbers and use a function reference `::isOdd` to pass the `isOdd` function to `printNumbers`.
// We also use a function reference `::isEven` to pass the `isEven` function.
// The output will display the odd and even numbers from the list.
// This demonstrates how function references can be used to pass functions as parameters in a concise way.
// Function references can also be used with higher-order functions, such as `map`, `filter`, and `forEach`, to apply operations on collections.
// They provide a clean and readable way to refer to functions without invoking them, making the code more maintainable and expressive.

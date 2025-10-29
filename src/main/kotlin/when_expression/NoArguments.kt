package when_expression

fun main(){
    // This program use a when expression without arguments to evaluate a number
    // If several conditions are true, only the first one will be executed
    val n = readln().toInt()

    when {
        n == 0 -> println("n is zero")
        n in 100..200 -> println("n is between 100 and 200")
        n > 300 -> println("n is greater than 300")
        n < 0 -> println("n is negative")
        // else-branch is optional here
    }
}
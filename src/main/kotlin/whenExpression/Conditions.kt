package whenExpression

fun main(){
    // This program uses conditional expressions to determine the relationship between three integers
    val (var1, var2, var3) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()
    val c = var3.toInt()

    println(when (c) {
        a + b -> "$c equals $a plus $b" // This checks if c is equal to the sum of a and b
        a - b -> "$c equals $a minus $b" // This checks if c is equal to the difference of a and b
        a * b -> "$c equals $a times $b" // This checks if c is equal to the product of a and b
        else -> "We do not know how to calculate $c" // This is the default case if none of the above conditions are met
    })
}
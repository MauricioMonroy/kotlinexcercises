package functions.named_arguments

// The default values for function parameters may or may not be constant. 
// They can also be another named argument or a function.
fun sum2(a: Int, b: Int = a) = a + b

fun main() {
    val calculate = sum2(1) // 1 + 1
	val calculate2 = sum2(2, 3) // 2 + 3	
    
    println("The first sum is equal to: $calculate")
    println("The second sum is equal to: $calculate2")
}

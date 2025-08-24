package annotations

// We can use the @Suppress annotation to suppress warnings in Kotlin.
fun main() {
    @Suppress("UNUSED_VARIABLE")
    val unusedVariable = 42 // This variable is never used, but the warning is suppressed.
    println("This code runs without warnings.")
    // You can also suppress multiple warnings by separating them with commas.
    @Suppress("UNUSED_VARIABLE", "UNUSED_PARAMETER")
    fun exampleFunction(param: Int) {
        val unusedVariable = 10 // This variable is never used, but the warning is suppressed.
        println("This function runs without warnings.")
    }
    exampleFunction(5) // Call the function to demonstrate that it works without warnings.
}

@Suppress("UNUSED_VARIABLE")
val myName = "Alex" // this variable is never used, but the warning is suppressed. //1
val myBirthYear = 1998 // this variable is never used, but the warning is not suppressed //2

@Suppress("UNUSED_VARIABLE") val myCatName = "Kitty" // this variable is never used, but the warning is suppressed //3

@Suppress("UNUSED_VARIABLE")

val myHobbies = listOf("Football", "Swimming", "Doing math homework") // this variable is never used, but the warning is suppressed //4
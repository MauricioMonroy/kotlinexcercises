package functions.functions_references

// Function references can be used to refer to functions of standard classes.
// In this example, we use a function reference to refer to the `dec` method of the `Int` class.
// The `dec` method returns the value of the integer decreased by one.
val dec: (Int) -> Int = Int::dec
fun main() = println(dec(10)) // Output: 9

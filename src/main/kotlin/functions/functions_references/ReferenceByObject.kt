package functions.functions_references

// The general form is the following:
// objectName::functionName

// In this example, we use a function reference to refer to the `indexOf` method of the `String` class.
// The `indexOf` method returns the index of the first occurrence of a specified substring within
// the string, or -1 if the substring is not found.
const val whatsGoingOnText: String = "What's going on here?"
val indexWithinWhatsGoingOnText: (String, Int, Boolean) -> Int = whatsGoingOnText::indexOf

// Result of applying it to different arguments
fun main() {
    println(indexWithinWhatsGoingOnText("going", 0, true)) // 7
    println(indexWithinWhatsGoingOnText("Hi", 0, true))  // -1
    println(indexWithinWhatsGoingOnText("what's", 0, false))  // -1
    println(indexWithinWhatsGoingOnText("what's", 0, true))  // 0
}

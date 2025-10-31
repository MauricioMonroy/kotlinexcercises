package types_and_data_structures.characters

fun main() {
    val ch: Char = readln().first()
    val ch1: Char = readln().last()
    val ch2 = ch + 1
    val ch3 = ch1 - 1
//    println("The next character for the input $ch is $ch2")
//    println("The previous character for the input $ch1 is $ch3")

    // Making a tab
    val tab = "\t"
    println("This is a tab: $tab")
    // Making a new line
    val newLine = "\n"
    println("This is a new line: $newLine")
    // Making a backslash
    val backslash = "\\"
    println("This is a backslash: $backslash")
    // Making a single quote
    val singleQuote = "\'"
    println("This is a single quote: $singleQuote")
    // Making a double quote
    val doubleQuote = "\""
    println("This is a double quote: $doubleQuote")
    // Making a carriage return
    val carriageReturn = "\r"
    println("This is a carriage return: $carriageReturn")
}
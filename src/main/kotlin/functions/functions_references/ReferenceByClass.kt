package functions.functions_references

// The general form is the following:
// ClassName::functionName

//Let's take a look at the function and of the class Int,
// which allow us to do logical AND with two binary numbers:

// Here's an example of how this function works:

val a = 5 and 4 // 101 & 100 = 100 (4)

//Also, we can call the function and in another way:

val b = 9.and(3) // 1001 & 0011 = 0001 (1)

//So, and is the function of class Int, and we can get the reference to it:

val and: (Int, Int) -> Int = Int::and

//Now we can invoke the 'and' function with two values, for example, 1 and 3:
fun main() = print(and(1, 3)) // the result is 1


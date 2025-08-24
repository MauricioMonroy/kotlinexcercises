package annotations

import org.jetbrains.annotations.NotNull

// Annotation before the code line
//@MyAnnotation class MyClass {
    // Annotation before the function
//    @MyAnnotation fun myFunction() {
        // Annotation before the variable
//        @MyAnnotation val myVariable = 42
//        println(myVariable)
//    }
    // Annotation above the property
//    @MyAnnotation
//    val myProperty: String = "Hello, World!"
//}

@Suppress("CanBeVal")
var myFirstName = "Mauricio" // Suppress annotation will be applied here
var myLastName = "Monroy" // No annotation here

fun main() {
    println("My name is $myFirstName $myLastName")
}

// It is possible apply two annotations to one field
@NotNull
@PrimaryKey(autoGenerate = true)
var id: Long = 0L

annotation class PrimaryKey(val autoGenerate: Boolean) // Custom annotation definition

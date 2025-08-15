package extension_functions

// Comparison of extension functions and member functions in Kotlin
class A {
    fun member() = println("hi from member")
}

fun A.extension() = println("hi from extension")

fun main() {
    val a = A()

    // Calling member function
    a.member()  // Output: hi from member

    // Calling extension function
    a.extension()  // Output: hi from extension

    // Note: Extension functions are resolved statically,
    // meaning they are not dispatched based on the runtime type of the object.
    // Member functions always has priority over extension functions when both are available.
    // If an extension function and a member function have the same name,
    // the member function will be called instead of the extension function.
    // This is because member functions are resolved based on the actual type of the object,
    // while extension functions are resolved based on the static type of the reference.
    // In this case, since `a` is of type `A`, the member function
    // `member()` is called instead of the extension function `extension()`.
    // If you want to call the extension function, you can do so explicitly:
    A::extension.call(a)  // Output: hi from extension
    // This will call the extension function even though there is a member function with the same name
    // because we are explicitly calling the extension function using the class reference.
    // This is a key difference between member functions and extension functions in Kotlin.
}
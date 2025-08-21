package functions.functions_references

class Person(val name: String, val lastName: String, val age: Int) {
    fun printPersonInfo(): String {
        return("Full name: $name $lastName | Age: $age")
    }
}

fun main() {
    val person = Person("Dmitry", "Max", 18)
    val personFun: () -> String = person::printPersonInfo
    // We can print normal function or use the especial function invoke
    println(personFun()) // Output: Full name: Dmitry Max | Age: 18
    println(personFun.invoke()) // Output: Full name: Dmitry Max | Age: 18
    // Output: Full name: Dmitry Max | Age: 18
}
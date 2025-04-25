package classes

class Emptiness {
    var nothing: String? = null
    var emptyString: String = ""
    var empty: Emptiness? = null
}

fun main() {
    // Creating an instance of the Emptiness class
    val instance = Emptiness()
    // Checking if the 'nothing' property is null
    if (instance.nothing == null) {
        println("The 'nothing' property is null.")
    } else {
        println("The 'nothing' property is not null.")
    }
    // Checking if the 'emptyString' property is empty
    if (instance.emptyString.isEmpty()) {
        println("The 'emptyString' property is empty.")
    } else {
        println("The 'emptyString' property is not empty.")
    }
    // Checking if the 'empty' property is empty
    if (instance.empty == null) {
        println("The 'empty' property is null.")
    } else {
        println("The 'empty' property is not null.")
    }
}
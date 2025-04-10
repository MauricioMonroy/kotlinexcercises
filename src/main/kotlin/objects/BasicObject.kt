package objects

fun main() {
    val firstObject = BasicObject()
    firstObject.name = "Object MockName"
    firstObject.displayObjectProperties()
}

class BasicObject {
    var name: String = "..."

    fun displayObjectProperties() {
        println("Object Name: $name")
    }
}
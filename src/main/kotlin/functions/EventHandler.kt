package functions

fun createEventHandler(elementType: String): () -> Unit {
    return {
        when (elementType) {
            "button" -> println("Button clicked")
            "link" -> println("Link clicked")
            "checkbox" -> println("Checkbox checked")
            else -> println("Unknown element type")
        }
    }
}
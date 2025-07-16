package memberFunctions

class VinylStore(var vinyl: String) {
    fun printVinyl() {
        println(this.vinyl)
    }
}

fun main() {
    val store = VinylStore("The Dark Side of the Moon")
    store.printVinyl() // Output: The Dark Side of the Moon
}
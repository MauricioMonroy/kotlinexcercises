package exceptions

fun pepTalk(name: String): String {
    val array = name.split(" ").toTypedArray()
    val firstName = array[0]
    val secondName = array[1]
    return "Don't lose the towel, traveler $firstName $secondName!"
}

fun main() {
    val name = readln()
    println("Good luck!")
    var advice: String? = null
    try {
        advice = pepTalk(name)
        println(advice)
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Don't lose the towel, nameless one.")
    } finally {
        advice = null
    }
}
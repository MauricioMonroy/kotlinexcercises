package ranges

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()

    val atLeastOneInRange = (a..b).contains(e) || (c..d).contains(e)
    println(atLeastOneInRange)
}
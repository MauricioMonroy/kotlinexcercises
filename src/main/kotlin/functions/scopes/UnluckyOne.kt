package functions.scopes

val unlucky = "My scope should change!"
fun main() {
    fun  check() {
        println(unlucky)
    }
    check()
}
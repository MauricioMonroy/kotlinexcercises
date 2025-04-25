package variables

data class User(val name: String, val age: Int)

fun main() {
    val user1 = User("John", 25)
    val user2 = User("John", 25)
    val user3 = user1

    println(user1 == user2)
    println(user1 === user2)
    println(user1 == user3)
    println(user1 === user3)
}
package collections.map.mutable_map

fun addUser(userMap: Map<String, String>, login: String, password: String): MutableMap<String, String> {
    val mutableUserMap = userMap.toMutableMap()
    if (login in mutableUserMap) {
        println("User with this login is already registered!")
    } else {
        mutableUserMap[login] = password
    }
    return mutableUserMap
}

fun main() {
    val user = readln()
    val password = readln()
    val users = mapOf("admin" to "admin", "user" to "password")
    val updatedUsers = addUser(users, user, password)
    println(updatedUsers)
}
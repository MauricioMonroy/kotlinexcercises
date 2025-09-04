package collections.list.mutable_list

fun names(namesList: List<String>): List<String> {
    val nameCount = mutableListOf<String>()
    for (name in namesList.distinct()) {
        val count = namesList.count { it == name }
        nameCount.add("The name $name is repeated $count times")
    }
    return nameCount
}

fun main() {
    val namesList = mutableListOf<String>()
    val totalNames = readln().toInt()
    repeat(totalNames) {
        val name = readln()
        namesList.add(name)
    }
    val result = names(namesList)
    for (line in result) {
        println(line)
    }
}

package types_and_data_structures.collections.map.mutable_map

fun main() {
    val groupOfStudents = mutableMapOf<String, Int>() // empty mutable map
    groupOfStudents.put("John", 4)
    groupOfStudents["Mike"] = 5
    groupOfStudents["Anastasia"] = 10

    val studentsFromOregon = mapOf("Alexa" to 7)

    groupOfStudents.putAll(studentsFromOregon)

    println(groupOfStudents) // output: {John=4, Mike=5, Anastasia=10, Alexa=7}

    // Associate a new value with an existing key
    groupOfStudents["John"] = 6 // Update John's value
    println(groupOfStudents) // output: {John=6, Mike=5, Anastasia=10, Alexa=7}

    // Adding an element using the plusAssign operator
    groupOfStudents += "Emily" to 8 // Add Emily with value 8
    println(groupOfStudents) // output: {John=6, Mike=5, Anastasia=10, Alexa=7, Emily=8}
}
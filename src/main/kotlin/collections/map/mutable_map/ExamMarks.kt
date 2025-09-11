package collections.map.mutable_map

fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    println("Enter the name and marks of students each one in new lines (type 'stop' to finish):")
    while (true) {
        val name = readln()
        if (name.lowercase() == "stop") break
        val marks = readln().toInt()
        if (name in studentsMarks) continue
        studentsMarks[name] = marks
    }
    println(studentsMarks)
}
package functions.functions_references

class Employee(
    private val id: Int,
    private val name: String,
    private val lastName: String,
    private val telNum: String,
    private val email: String
) {
    fun printData() {
        println("Employee $id")
        println("full name: $name $lastName")
        println("tel. num: $telNum")
        println("email: $email")
    }
}

fun main() {
    val count = readln().toInt()
    // create reference to the constructor Employee
    createEmployees(::Employee, count)
}

fun createEmployees(employeeCreator: (Int, String, String, String, String) -> Employee, count: Int) {
    val employees = mutableListOf<Employee>()
    for (i in 1..count) {
        val (name, lastName, telNum, email) = readln().split(' ').toList()
        employees += employeeCreator(i, name, lastName, telNum, email)
    }
    employees.forEach { it.printData() }
}
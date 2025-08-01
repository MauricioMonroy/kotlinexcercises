package collections.map

fun main() {
    val employees = mapOf(
        "Mike" to 1500,
        "Jim" to 500,
        "Sara" to 1000
    )
    if (!employees.isEmpty()) {
        println("Number of employees: ${employees.size}") // Output: Number of employees: 3
    } else {
        println("Employees map is empty.")
    }
    println("Mike's salary: ${employees["Mike"]}") // Output: Mike's salary: 1500)

    val isWanted = employees.containsKey("Jim")
    println("Is Jim wanted? $isWanted") // Output: Is Jim wanted? true

    val isAnyoneWillingToWork = employees.containsValue(500)
    println("Is anyone willing to work for 500? $isAnyoneWillingToWork") // Output: Is anyone willing to work for 500? true

    // Iterating through the map
    for (employee in employees) {
        println("Employee: ${employee.key}, Salary: ${employee.value}")
    }
    // Output:
    // Employee: Mike, Salary: 1500
    // Employee: Jim, Salary: 500
    // Employee: Sara, Salary: 1000

}
package types_and_data_structures.arrays.for_loop_and_arrays

fun main() {
    val daysOfWeek = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    // Normal for loop to iterate through the array
    for (day in daysOfWeek) {
        println(day)
    }
    // Output:
    // Monday
    // Tuesday
    // Wednesday
    // Thursday
    // Friday
    // Saturday
    // Sunday

    // Iterating by indexes
    for (index in daysOfWeek.indices) {
        println("Day ${index + 1}: ${daysOfWeek[index]}")
    }
    // Output:
    // Day 1: Monday
    // Day 2: Tuesday
    // Day 3: Wednesday
    // Day 4: Thursday
    // Day 5: Friday
    // Day 6: Saturday
    // Day 7: Sunday

    // Iterating by range indexes
    for (index in 1..5) {
        println("Day ${index}: ${daysOfWeek[index - 1]}")
    }
    // Output:
    // Day 1: Monday
    // Day 2: Tuesday
    // Day 3: Wednesday
    // Day 4: Thursday
    // Day 5: Friday

    // Accessing to last element
    for (index in 1 until daysOfWeek.lastIndex) {
        println("${index}: ${daysOfWeek[index]}")
    }
    // Output:
    // 1: Tuesday
    // 2: Wednesday
    // 3: Thursday
    // 4: Friday
    // 5: Saturday

    // Iterating in reverse order with a step of 2
    for (index in daysOfWeek.size - 1 downTo 0 step 2) {
        println("Reversed Day ${index}: ${daysOfWeek[index]}")
    }
    // Output:
    // Reversed Day 6: Sunday
    // Reversed Day 4: Friday
    // Reversed Day 2: Wednesday
    // Reversed Day 0: Monday
}
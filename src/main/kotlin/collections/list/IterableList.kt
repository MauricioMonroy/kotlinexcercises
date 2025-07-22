package collections.list

fun main() {
    val participants = listOf(
        "Alice",
        "Bob",
        "Charlie",
        "Diana",
        "Ethan"
    )

    for (participant in participants) {
        println("Welcome to the party, $participant!")
    }

    // Output:
    // Welcome to the party, Alice!
    // Welcome to the party, Bob!
    // Welcome to the party, Charlie!
    // Welcome to the party, Diana!
    // Welcome to the party, Ethan!
}
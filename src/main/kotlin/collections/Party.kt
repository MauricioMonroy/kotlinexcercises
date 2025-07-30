package collections

fun main() {
    val partyList = listOf(
        "Alice",
        "Bob",
        "Charlie",
        "Diana",
        "Ethan"
    )

    if (!partyList.isEmpty()) {
        val size = partyList.size
        val whoIsFirst = partyList[0]
        val whoIsLast = partyList[size - 1]
        println("The party will not be empty. There are $size people in the party.")
        println("The first person in the party is $whoIsFirst and the last person is $whoIsLast.")
        // Output: The party will not be empty. There are 5 people in the party.
        // The first person in the party is Alice and the last person is Ethan.

        println("Bob came in ${partyList.indexOf("Bob") + 1} position.")
        // The indexOf function returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
        // Output: Bob came in 2 position.
        println("Is it true that Diana is in the party? ${partyList.contains("Diana")}")
        // The contains function returns true if the list contains the specified element, false otherwise.
        // Output: Is it true that Diana is in the party? true

        // Other useful methods for lists:
        println("The party list is sorted: ${partyList.sorted()}")
        // The sorted function returns a new list with the elements sorted in natural order.
        // Output: The party list is sorted: [Alice, Bob, Charlie, Diana, Ethan]
        println("The party list in reverse order: ${partyList.reversed()}")
        // The reversed function returns a new list with the elements in reverse order.
        // Output: The party list in reverse order: [Ethan, Diana, Charlie, Bob, Alice]
        println("The party list in uppercase: ${partyList.map { it.uppercase() }}")
        // The map function returns a new list with the results of applying the given function to each element in the list.
        // Output: The party list in uppercase: [ALICE, BOB, CHARLIE, DIANA, ETHAN]
    }
}

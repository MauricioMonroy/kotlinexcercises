package types_and_data_structures.collections.set.mutable_set

fun subtraction(elements: Set<String>, element: String): MutableSet<String> {
    val resultSet = elements.toMutableSet()
    resultSet.remove(element)
    return resultSet
}

fun main() {
    println("Enter a phrase:")
    val phraseInput = readln()
    println("Enter a word to remove:")
    val elementToRemove = readln()
    val elementsSet = phraseInput.split(" ").toSet()
    val result = subtraction(elementsSet, elementToRemove)
    println(result)
}
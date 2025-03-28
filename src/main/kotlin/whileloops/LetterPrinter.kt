package whileloops

fun main() {
    print("Enter a letter: ")
    var letter = readln().toCharArray()[0] // Read the input and convert it to Char

    while (letter <= 'Z') {
        print(letter)
        letter++
    }
}
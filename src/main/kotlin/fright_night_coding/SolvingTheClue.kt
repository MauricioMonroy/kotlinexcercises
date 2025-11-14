package fright_night_coding

import kotlin.text.iterator

/*
* This program reads a string input and prints all characters that appear only once in the string.
* It iterates through each character in the input string and checks if the index of the first
* occurrence of the character is the same as the index of the last occurrence. If they are the same,
* it means the character appears only once, and it is printed.
*/

fun main() {
    val input = readln()
    for (i in input) {
        if (input.indexOf(i) == input.lastIndexOf(i)) {
            print(i)
        }
    }
}

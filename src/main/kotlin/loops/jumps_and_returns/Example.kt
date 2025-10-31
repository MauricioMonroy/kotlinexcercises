package loops.jumps_and_returns

fun main() {

    // Break statement example
    println("Before the loop")
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println("$i ")
    }
    // Output:
    // 1
    // 2
    // 3
    // 4
    println("After the loop")

    // Continue statement example
    println("Before the loop")
    var result = ""
    for (i in "hello world") {
        if (i == 'o') continue
        result += i
    }
    println(result)
    // Output: hell wrld
    println("After the loop")
    // The continue statement skips the character 'o' in the loop
    // and continues with the next iteration.

    // Inner loops and structural jumps example
    // Using labels with break to exit outer loop
    // Label can be identified by any valid identifier followed by @
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                break@loop
            }
            println("i: $i, j: $j")
        }
        println("Finished to examine i = $i")
    }
    //  Output:
    // i: 1, j: 1
    // i: 1, j: 2
    // i: 1, j: 3
    // Finished to examine i = 1
    // i: 2, j: 1
    // The break@loop statement exits the outer loop when i == 2 and j == 2.

    // Using when with break and continue
    for (i in 1..10) {
        when (i) {
            3 -> continue
            6 -> break
            else -> println(i)
        }
    }
    // Output:
    // 1
    // 2
    // 4
    // 5
    // The continue statement skips the iteration when i == 3
    // and the break statement exits the loop when i == 6.

    //
}
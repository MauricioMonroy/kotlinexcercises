package loops

fun main() {
    for (i in 1..3) {
        for (j in 1..i) {
            print(j) // This prints 112123 because:
            // In the first iteration (i=1), it prints 1
            // In the second iteration (i=2), it prints 12
            // In the third iteration (i=3), it prints 123
        }
    }
}
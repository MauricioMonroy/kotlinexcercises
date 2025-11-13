package loops.jumps_and_returns

fun main() {
    for (i in 1..4) {
        loop@ for (j in 1..3) {
            for (k in 1..2) {
                if (i == 2 || j == 3 || k == 2) break@loop
                print("$k") // Output: 111 because when i=2, j=3, or k=2, it breaks the loop labeled 'loop'
            }
        }
    }
}
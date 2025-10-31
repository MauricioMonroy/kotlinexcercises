package loops.jumps_and_returns

fun main() {
    for (i in 1..3) {
        if (i == 1)
            continue
        print(1)
        loop@ for (j in 1..2) {
            for (k in 1..2) {
                if (i == 2 || j == 3) break@loop
                print(2)
            }
            if (j == 1) return
            print(3)
        }
    }
    // Output: 1122
    // Explanation:
    // - When i = 1, continue skips the rest of the loop, so nothing is printed.
    // - When i = 2, it prints '1', then enters the loop labeled 'loop'.
    //   - For j = 1, it enters the innermost loop:
    //     - For k = 1, it prints '2'.
    //     - For k = 2, it prints '2' again.
    //   - After the innermost loop, since j = 1, the return statement is executed, terminating the main function.
}

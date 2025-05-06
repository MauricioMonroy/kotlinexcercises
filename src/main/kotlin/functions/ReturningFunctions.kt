package functions

// We have a real grade function, which returns its argument
// and a grade function with a penalty, which returns its argument minus 1.
fun getRealGrade(x: Double) = x
fun getGradeWithPenalty(x: Double) = x - 1

fun getScoringFunction(isCheater: Boolean): (Double) -> Double {
    if (isCheater) {
        return ::getGradeWithPenalty
    }

    return ::getRealGrade
}

//fun main() {
//    val isCheater = true
//    val scoringFunction = getScoringFunction(isCheater)
//    println(scoringFunction(5.0)) // 4.0
//}

// Function references as function parameters
fun applyAndSum(a: Int, b: Int, transformation: (Int) -> Int): Int {
    return transformation(a) + transformation(b)
}

// Declaring transformation functions
fun same(x: Int) = x
fun square(x: Int) = x * x
fun triple(x: Int) = 3 * x

// Pass them to the former function
fun main() {
    // Function references
    println(applyAndSum(1, 2, ::same)) // 3 = 1 + 2
    println(applyAndSum(1, 2, ::square)) // 5 = 1 * 1 + 2 * 2
    println(applyAndSum(1, 2, ::triple)) // 9 = 3 * 1 + 3 * 2
}

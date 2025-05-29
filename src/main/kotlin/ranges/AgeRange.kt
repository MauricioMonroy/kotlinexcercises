package ranges

fun main() {
    println("Enter your age:")
    val age = readln().toInt()
    val ageRange = age in 18..59
    if (ageRange) {
        println("You are within the age range, so can apply for the job.")
    } else {
        println("You are outside the age range, so cannot apply for the job.")
    }
}

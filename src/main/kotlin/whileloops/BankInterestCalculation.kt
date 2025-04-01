package whileloops

fun findYears(depo: Double): Int {
    var deposit = depo
    val interestRate = 1.071 // 7.1% interest rate
    val max = 700000
    var years = 0
    // implement the while loop here
    while (deposit < max) {
        deposit *= interestRate
        years++
    }
    return years
}

fun main() {
    print("Enter the deposit amount: ")
    val deposit = readln().toDouble()
    val years = findYears(deposit)
    println("It will take $years years to reach 700,000.")
}
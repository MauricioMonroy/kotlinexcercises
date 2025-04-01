package whileloops

fun main() {
    var balance = readln().toInt()  // Read the initial balance
    val payments = readln().split(" ").map { it.toInt() }  // Read the payments as a list of integers

    for (purchase in payments) {
        if (purchase > balance) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
            return
        }
        balance -= purchase
    }
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}

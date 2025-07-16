package constructors

class BankAccount(var deposited: Long, var withdrawn: Long) {
    val balance: Long
        get() = deposited - withdrawn
    // we can also add a method to display the balance
    fun displayBalance() {
        println("Current balance: $balance")
    }
}

fun main() {
    val account = BankAccount(1000, 200)
    account.displayBalance() // Output: Current balance: 800
    account.deposited += 500
    account.withdrawn += 100
    account.displayBalance() // Output: Current balance: 1200
}
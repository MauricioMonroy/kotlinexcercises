package functionalDecomposition

fun validatePassword(password: String): Boolean {
    var validationResult = false
    while (!validationResult) {
        validationResult = password.length > 4
        if (!validationResult) {
            println("Your password should be five or longer characters, please write a new password")
            return false
        }
    }
    println("Good password")
    return true
}

fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}
package functions.functionalDecomposition

fun accessSmartHome() {
    val password = "31415926538"
    print("Enter password: ")
    val passwordInput = readln()
    if (passwordInput == password)
        chooseAction()
    else
        println("Wrong password")
}

fun chooseAction() {
    println(
        "Choose an action: \n1. Control lights\n2. Control music" +
                "\n3. Control kettle"
    )
    val action = readln().toInt()

    when (action) {
        1 -> controlLights()
        2 -> controlMusic()
        3 -> controlKettle()
        else -> println("Invalid action")
    }
}

fun controlLights() {
    println("on/off?")
    val tumbler = readln()

    when (tumbler) {
        "on" -> println("Lights are on")
        "off" -> println("Lights are off")
        else -> println("Invalid command")
    }
}

fun controlMusic() {
    println("on/off?")
    val tumbler = readln()

    when (tumbler) {
        "on" -> println("Music is on")
        "off" -> println("Music is off")
        else -> println("Invalid command")
    }
}

fun controlKettle() {
    println("on/off?")
    val tumbler = readln()

    when (tumbler) {
        "on" -> println("Kettle is on")
        "off" -> println("Kettle is off")
        else -> println("Invalid command")
    }
}

fun main() {
    accessSmartHome()
}
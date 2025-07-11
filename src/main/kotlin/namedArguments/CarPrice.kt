package namedArguments

fun main() {
    println("Enter the car features: age, kilometers, maximum speed, automatic (true/false) separated by spaces:")
    val features = readln().split(" ")
    val old = features.getOrNull(0)?.toIntOrNull() ?: 5
    val kilometers = features.getOrNull(1)?.toIntOrNull() ?: 100000
    val maximumSpeed = features.getOrNull(2)?.toIntOrNull() ?: 120
    val automatic = features.getOrNull(3)?.toBooleanStrictOrNull() ?: false
    println(carPrice(old, kilometers, maximumSpeed, automatic))
}

fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    val agePrice = old * 2000
    val kilometersPrice = (kilometers / 10000) * 200
    val speedPrice = if (maximumSpeed > 120) {
        (maximumSpeed - 120) * 100
    } else {
        (120 - maximumSpeed) * -100
    }
    val automaticPrice = if (automatic) 1500 else 0
    val basePrice = 20000
    println(basePrice - agePrice - kilometersPrice + speedPrice + automaticPrice)
}

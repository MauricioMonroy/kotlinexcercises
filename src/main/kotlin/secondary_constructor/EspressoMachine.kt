package secondary_constructor

class EspressoMachine (val costPerServing: Float) {
    var coffeeCapsulesCount: Int = 0
    var totalCost: Float = 0.0f

    init {
        println("Espresso machine is created with a cost of $costPerServing per serving")
    }

    constructor(coffeeBeansWeight: Float, totalCost: Float) : this(totalCost / (coffeeBeansWeight / 10)) {
        this.totalCost = totalCost
        this.coffeeCapsulesCount = (coffeeBeansWeight / 10).toInt()
        println("Espresso machine is created with $coffeeCapsulesCount capsules, costing $totalCost in total")
    }
}

fun main() {
    val machine1 = EspressoMachine(0.5f)
    println("Cost per serving: ${machine1.costPerServing}, Capsules count: ${machine1.coffeeCapsulesCount}, Total cost: ${machine1.totalCost}")

    val machine2 = EspressoMachine(100.0f, 50.0f)
    println("Cost per serving: ${machine2.costPerServing}, Capsules count: ${machine2.coffeeCapsulesCount}, Total cost: ${machine2.totalCost}")
}
// Output:
// Espresso machine is created with a cost of 0.5 per serving
// Cost per serving: 0.5, Capsules count: 0, Total cost: 0.0
// Espresso machine is created with 500 capsules, costing 50.0
// Cost per serving: 0.1, Capsules count: 500, Total cost: 50.0
// Espresso machine is created with a cost of 0.1 per serving

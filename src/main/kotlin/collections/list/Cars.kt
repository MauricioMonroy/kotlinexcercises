package collections.list

// List are used to store a collection of items in a specific order.
// In this example, we create a class `Cars` that holds a list of `Car` objects.
// Each element of the list are immutable, but the list itself can be modified.

class Cars(
    val cars: List<Car>
) {
    fun getCarByIndex(index: Int): Car? {
        return if (index in cars.indices) {
            cars[index]
        } else {
            null
        }
    }

    fun getAllCars(): List<Car> {
        return cars
    }
}

class Car(
    val make: String,
    val model: String,
    val year: Int
) {
    override fun toString(): String {
        return "$year $make $model"
    }
}

fun main() {
    val car1 = Car("Toyota", "Camry", 2020)
    val car2 = Car("Honda", "Civic", 2019)
    val car3 = Car("Ford", "Mustang", 2021)

    val carsList = Cars(listOf(car1, car2, car3))

    println(carsList.getCarByIndex(1)) // Output: 2019 Honda Civic
    println(carsList.getAllCars()) // Output: [2020 Toyota Camry, 2019 Honda Civic, 2021 Ford Mustang]
}
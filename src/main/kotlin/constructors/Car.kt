package constructors

class Car(val brand: String, val model: String, val year: Int) {
    init {
        println("Car brand: $brand, Model: $model, Year: $year")
    }
}

fun main() {
    val car1 = Car(brand = "Toyota", model = "Corolla", year = 2020)
    val car2 = Car(brand = "Honda", model = "Civic", year = 2021)
    val car3 = Car(brand = "Ford", model = "Mustang", year = 2022)
    println("Created cars: ${car1.brand}, ${car2.brand}, ${car3.brand}")
}
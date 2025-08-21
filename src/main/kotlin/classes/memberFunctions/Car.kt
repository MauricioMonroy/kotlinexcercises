package classes.memberFunctions

class Car(val make: String, val year: Int) {

    var speed: Int = 0

    // write the methods here
    fun accelerate(increment: Int = 5) {
        // accelerate adds 5 to the speed property each time it's called
        speed += increment
    }

    fun decelerate(decrement: Int = 5) {
        // decelerate subtracts 5 from the speed property each time it's called
        speed -= decrement
        if (speed < 0) speed = 0 // ensure speed doesn't go below 0
    }
}

fun main() {
    val car = Car("Toyota", 2020)
    println("Initial speed: ${car.speed} km/h") // Output: Initial speed: 0 km/h

    car.accelerate()
    println("Speed after accelerating: ${car.speed} km/h") // Output: Speed after accelerating: 5 km/h

    car.decelerate()
    println("Speed after decelerating: ${car.speed} km/h") // Output: Speed after decelerating: 0 km/h

    car.accelerate(10)
    println("Speed after accelerating by 10: ${car.speed} km/h") // Output: Speed after accelerating by 10: 10 km/h
}
package secondary_constructor

class Size {
    var width: Int = 0
    var height: Int = 0

    constructor(_width: Int, _height: Int) {
        width = _width
        height = _height
    }

    // It is posible use multiple constructors but each one must have a different signature.
    constructor(_height: Int) {
        height = _height
    }

    constructor(_width: Int, _height: Double) {
        width = _width
        height = _height.toInt()
    }

    constructor(_height: Double, _width: Int) {
        width = _width
        height = _height.toInt()
    }

    // We can also create different objects with the same property values
    val size1 = Size(10, 20) // uses the first constructor
    val size2 = Size(20) // uses the second constructor
    val size3 = Size(30, 40.0) // uses the third constructor
    val size4 = Size(50.0, 60) // uses the fourth constructor

    // Signatures are defined by the types and number of parameters, not by the names of the parameters.
    // For example, the following constructor would not be valid because it has the same signature as
    // the first constructor:
    // constructor(_width: Int, _height: Int) {
    //     width = _width
    //     height = _height
    // }

    // Constructor using the keyword 'this' to call another constructor in the same class.
    class Car {
        var speed: Long = 0
        var time: Int = 0

        constructor(speed: Long, time: Int) {
            this.speed = speed
            this.time = time
        }
    }
}

fun main() {
    // Creating instances of Size using different constructors
    val size1 = Size(10, 20)
    val size2 = Size(20)
    val size3 = Size(30, 40.0)
    val size4 = Size(50.0, 60)

    println("Size1: width=${size1.width}, height=${size1.height}")
    println("Size2: width=${size2.width}, height=${size2.height}")
    println("Size3: width=${size3.width}, height=${size3.height}")
    println("Size4: width=${size4.width}, height=${size4.height}")

    // Creating an instance of Car
    val car = Size.Car(100L, 5)
    println("Car: speed=${car.speed}, time=${car.time}")
}


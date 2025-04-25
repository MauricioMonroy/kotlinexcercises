package classes

class Plane {
    val canFly: Boolean = true
    var family: String = "Unknown"
}

fun main() {
    var plane = Plane()
    /* operation */
    // plane = 5 // Not allowed, as 'plane' is of type Plane
    plane = Plane() // Reassigning to a new instance of Plane
    // plane.canFly = false // Not allowed, as 'canFly' is a val property
    plane.family = "Airbus A380" //
}
package secondary_constructor

class Sizes(val width: Int, val height: Int) {
    var area: Int = width * height

    init {
        println("Object with area equal to $area is created")
    }

    constructor(width: Int, height: Int, outerSizes: Sizes) : this(width, height) {
        outerSizes.area -= this.area
        println("Updated outer object's area is equal to ${outerSizes.area}")
    }
}

fun main() {
    val outerObject = Sizes(5, 8)
    val innerObject = Sizes(2, 3, outerObject)
}
package constructors.secondary_constructor

fun main() {
    class Size(val width: Int, val height: Int) {
        var area: Int = width * height

        constructor(width: Int, height: Int, outerSize: Size) : this(width, height) {
            outerSize.area -= this.area
            println("Updated outer object's area is equal to ${outerSize.area}")
        }
    }
}
// When you run this code, it will not produce any output
// because the main function does not create any instances of the `Size` class or invoke its constructors.
// To see the output, you can modify the `main` function to create an instance of `Size` and pass another `Size` object to the secondary constructor.
// Here's an example:
// fun main() {
//     val outerSize = Size(100, 200)
//     val innerSize = Size(50, 50, outerSize)
//     println("Inner Size: width=${innerSize.width}, height=${innerSize.height}, area=${innerSize.area}")
//     println("Outer Size: width=${outerSize.width}, height=${outerSize.height}, area=${outerSize.area}")
// }
//
// This will create an inner `Size` object and update the area of the outer `Size` object, producing output like:
// Updated outer object's area is equal to 7500
// Inner Size: width=50, height=50, area=2500
// Outer Size: width=100, height=200, area=7500
//
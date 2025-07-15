package constructors

class Size {
    var width: Int = 1
    var height: Int = 1
}

// We can perform a constructor call in the body of a class.
// This generates a primary constructor without arguments.
val size = Size()

class SizeWithConstructor(width: Int, height: Int) {
    val width: Int = width
    val height: Int = height
    val area: Int = width * height
}

class SizeWithExplicitConstructorReference constructor(width: Int, height: Int) {
    val width: Int = width
    val height: Int = height
    val area: Int = width * height
    // This is an explicit constructor reference.
}

// Properties can be declared in the primary constructor.
class SizeWithPropertiesInConstructor(val width: Int, val height: Int) {
    val area: Int = width * height
}

// Default and named arguments can be used in constructors.
class SizeWithDefaultAndNamedArguments(
    val width: Int = 1,
    val height: Int = 1
) {
    val area: Int = width * height
}

// Single line classes can be used for simple data structures.
class SizeWithSingleLineClass(val width: Int, val height: Int)

// We can use the `init` block to perform initialization logic.
class SizeWithInitBlock(_width: Int, _height: Int) {
    var width: Int = 0
    var height: Int = 0

    init {
        width = if (_width >= 0) _width else {
            println("Width cannot be negative, setting to 0")
            0
        }
        height = if (_height >= 0) _height else {
            println("Height cannot be negative, setting to 0")
            0
        }
    }
}

// We can use the `init` block to perform additional initialization logic.
class SizeWithMultipleInitBlocks(_width: Int, _height: Int) {
    var width: Int = 0
    var height: Int = 0

    init {
        width = if (_width >= 0) _width else {
            println("Width cannot be negative, setting to 0")
            0
        }
    }

    init {
        height = if (_height >= 0) _height else {
            println("Height cannot be negative, setting to 0")
            0
        }
    }
}

fun main() {
    // Example usage of the classes
    val size = Size()
    println("Size: width=${size.width}, height=${size.height}")

    val sizeWithConstructor = SizeWithConstructor(5, 10)
    println("Size with constructor: width=${sizeWithConstructor.width}, height=${sizeWithConstructor.height}, area=${sizeWithConstructor.area}")

    val sizeWithExplicitConstructorReference = SizeWithExplicitConstructorReference(5, 10)
    println("Size with explicit constructor reference: width=${sizeWithExplicitConstructorReference.width}, height=${sizeWithExplicitConstructorReference.height}, area=${sizeWithExplicitConstructorReference.area}")

    val sizeWithPropertiesInConstructor = SizeWithPropertiesInConstructor(5, 10)
    println("Size with properties in constructor: width=${sizeWithPropertiesInConstructor.width}, height=${sizeWithPropertiesInConstructor.height}, area=${sizeWithPropertiesInConstructor.area}")

    val sizeWithDefaultAndNamedArguments = SizeWithDefaultAndNamedArguments(height = 5)
    println("Size with default and named arguments: width=${sizeWithDefaultAndNamedArguments.width}, height=${sizeWithDefaultAndNamedArguments.height}, area=${sizeWithDefaultAndNamedArguments.area}")

    val sizeWithSingleLineClass = SizeWithSingleLineClass(5, 10)
    println("Size with single line class: width=${sizeWithSingleLineClass.width}, height=${sizeWithSingleLineClass.height}")

    val sizeWithInitBlock = SizeWithInitBlock(-5, 10)
    println("Size with init block: width=${sizeWithInitBlock.width}, height=${sizeWithInitBlock.height}")

    val sizeWithMultipleInitBlocks = SizeWithMultipleInitBlocks(-5, -10)
    println("Size with multiple init blocks: width=${sizeWithMultipleInitBlocks.width}, height=${sizeWithMultipleInitBlocks.height}")
}

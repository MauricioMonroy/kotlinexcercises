package constructors.secondary_constructor

class Kitty(val color: String, val age: Int) {
    // Example of 'String + Int' constructor
    constructor(color: String, age: String) : this(color, age.toInt())
    // Example of 'Int + String' constructor
    constructor(age: Int, color: String) : this(color, age)
    // Example of 'String' constructor
    constructor(color: String) : this(color, 0)
    // Example of 'Int' constructor
    constructor(age: Int) : this("unknown", age)
}
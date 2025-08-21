package constructors.secondary_constructor

class IceCreamOrder private constructor(val price: Int, @Suppress("UNUSED_PARAMETER") tag: String) {

    constructor(popsicles: Int) : this(popsicles * 7, "popsicle")

    constructor(scoops: Int, toppings: Int) : this(scoops * 5 + toppings * 2, "sundae")
}




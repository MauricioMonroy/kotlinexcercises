package variables

fun main() {
    // Example 1
    var a: Int = 100
    val anotherA: Int = a
    println(a == anotherA) // true
    println(a === anotherA) // true
    a = 200
    println(a == anotherA) // false
    println(a === anotherA) // false
    // We can see that the value of a has changed, but the value of anotherA remains the same.
    // This is because anotherA is a copy of the value of a, not a reference to the same object.

    // Example 2
    var d1: Double = 1.5
    val d2 = d1
    println(d1 === d2) // true
    d1 += 1            // d1 is 2.5 now
    println(d1 === d2) // false

    // Example with modifiable objects
    val list1: MutableList<Int> = mutableListOf()
    val list2: MutableList<Int> = list1
    list1.add(1)
    println("list1 $list1") // list1 [1]
    println("list2 $list2") // list2 [1]
    list2.add(5)
    println("list1 $list1") // list1 [1, 5]
    println("list2 $list2") // list2 [1, 5]
}
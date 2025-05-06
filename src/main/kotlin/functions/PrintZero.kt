package functions

fun f(): Int {
    return 0
}

fun main() {
    val q = f() // Type of q is Int
    print(q)

    val m = ::f // Type of m is KFunction<Int> or () -> Int
    print(m())
}
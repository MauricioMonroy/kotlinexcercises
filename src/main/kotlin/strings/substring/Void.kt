package strings.substring

fun main() {
    val str = "content"
    //println(str.substring(-1,-1)) // throws StringIndexOutOfBoundsException
    println(str.substringBefore("c")) // ""
    println(str.substring(0,0)) // ""
//    println(str.substringAfter("t")) // "ent"
//    println(str.substring(0,1 )) // "c"
    println(str.substring(1,1 )) // ""
}
package namedArguments

// The greetNeo() function returns "Hello, Mr. Anderson" with correct arguments
// Otherwise returns "MAtrix error"
fun greetUser(
    name: String,
    admin: Boolean = false,
    smith: Boolean = false,
    honorific: String = "",
    greet: String = "Greetings"
): String {
    return if (!admin && !smith) {
        "$greet, $honorific $name"
    } else {
        "Matrix Error"
    }
}       

fun greetNeo() = greetUser(
    "Anderson",
    false,
    false,
    "Mr.",
    "Hello",
)

fun main() {
    println(greetNeo())
}

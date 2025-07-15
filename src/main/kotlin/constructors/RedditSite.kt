package constructors

class Site(val address: String, val foundationYear: Int) {

}

fun makeReddit(address: String = "reddit.com"): Site {
    return Site(address, 2005)
}

fun main() {
    val reddit = makeReddit()
    println("Reddit is located at ${reddit.address} and was founded in ${reddit.foundationYear}.")

    val customSite = makeReddit("customsite.com")
    println("Custom site is located at ${customSite.address} and was founded in ${customSite.foundationYear}.")
}


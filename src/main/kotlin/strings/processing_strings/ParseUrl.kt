package strings.processing_strings

fun main() {
    val url = readln()
    val query = url.substringAfter('?', "")
    if (query.isEmpty()) return

    val pairs = query.split('&').mapNotNull { param ->
        val idx = param.indexOf('=')
        if (idx == -1) null else param.take(idx) to param.substring(idx + 1)
    }

    var passValue: String? = null
    for ((key, value) in pairs) {
        val display = value.ifEmpty { "not found" }
        println("$key : $display")
        if (key == "pass") passValue = value
    }

    if (passValue != null) {
        val display = passValue.ifEmpty { "not found" }
        println("password : $display")
    }
}
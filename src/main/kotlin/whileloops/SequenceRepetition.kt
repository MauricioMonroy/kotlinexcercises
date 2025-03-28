package whileloops

fun main() {
    print("Type a number: ")
    val n = readln().toInt()

    var count = 0

    for (i in 1..n) {
        for (j in 1..i) {
            if (count >= n) break
            print("$i ")
            count++
        }
        if (count >= n) break
    }
}

/*
fun main() {
    print("Type a number: ")
    val n = readln().toInt()

    var count = 0  // Contador de números impresos
    var i = 1  // Número a imprimir

    while (count < n) {
        var j = 0  // Controla cuántas veces se imprime el número actual
        while (j < i && count < n) {
            print("$i ")
            count++
            j++
        }
        i++ // Pasamos al siguiente número
    }
}

 */
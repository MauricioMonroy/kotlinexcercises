package types_and_data_structures.arrays.for_loop_and_arrays

fun main() {
    val numberOfCompanies = readln().toInt()
    val incomes = LongArray(numberOfCompanies)
    val taxRates = LongArray(numberOfCompanies)

    for (i in 0..incomes.lastIndex) {
        incomes[i] = readln().toLong()
    }
    for (i in 0..taxRates.lastIndex) {
        taxRates[i] = readln().toLong()
    }

    var maxProduct = Long.MIN_VALUE
    var maxIndex = 0
    for (i in 0..numberOfCompanies - 1) {
        val product = incomes[i] * taxRates[i] // compare incomes * rate to avoid truncation
        if (product > maxProduct) {
            maxProduct = product
            maxIndex = i
        }
    }

    println(maxIndex + 1)
}

// The program reads the number of companies, their incomes, and tax rates, and calculates the individual taxes for each company. It then finds and prints the 1-based index of the company with the highest individual tax.
package types_and_data_structures.collections.list

fun main() {
    val numberOfCompanies = readln().toInt()
    val annualIncome = IntArray(numberOfCompanies) { readln().toInt() }
    val taxRate = IntArray(numberOfCompanies) { readln().toInt() }

    var maxTax = -1.0
    var bestIndex = 0
    var bestIncome = 0

    for (i in 0 until numberOfCompanies) {
        val tax = annualIncome[i] * taxRate[i] / 100.0
        if (tax > maxTax) {
            maxTax = tax
            bestIndex = i
            bestIncome = annualIncome[i]
        } else if (tax == maxTax) {
            if (tax > 0.0) {
                if (annualIncome[i] > bestIncome) {
                    bestIndex = i
                    bestIncome = annualIncome[i]
                }
            }
        }
    }
    println(bestIndex + 1)
}

//fun main() {
//    val numberOfCompanies = readln().toInt()
//    val annualIncome = mutableListOf<Int>()
//    repeat(numberOfCompanies) {
//        annualIncome.add(readln().toInt())
//    }
//    val taxRate = mutableListOf<Int>()
//    repeat(numberOfCompanies) {
//        taxRate.add(readln().toInt())
//    }
//    val taxValue = annualIncome.mapIndexed { index, income ->
//        income * taxRate[index] / 100.0
//    }
//    val maxTax = taxValue.maxOrNull() ?: 0.0
//    val candidates = taxValue.withIndex().filter { it.value == maxTax }
//    val best = if (maxTax > 0.0) {
//        candidates.maxByOrNull { annualIncome[it.index] }?.index
//    } else {
//        candidates.minByOrNull { it.index }?.index
//    } ?: 0
//    println(best + 1)
//}
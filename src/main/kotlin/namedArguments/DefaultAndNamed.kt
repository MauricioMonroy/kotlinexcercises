package namedArguments

fun calcEndDayAmount(startAmount: Int = 0, ticketPrice: Int, soldTickets: Int) =
        startAmount + ticketPrice * soldTickets

fun main() {
    // val amount = calcEndDayAmount(10, 500)  // Won't work —
                                        // no value for soldTickets
    val amount = calcEndDayAmount(
        ticketPrice = 10, 
        soldTickets = 500)  
    println(amount) // 5000
}

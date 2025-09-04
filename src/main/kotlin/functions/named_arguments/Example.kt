package functions.named_arguments

// We can declare standard variables and pass them on,
// but sometimes you have to work with literals, not variables. 
// Named arguments can make our code more readable.

fun calcEndDayAmount(startAmount: Int, ticketPrice: Int, soldTickets: Int) =
        startAmount + ticketPrice * soldTickets

fun main() {
    val amount = calcEndDayAmount(
      // We can name each argument of this function
        startAmount = 1000, 
        ticketPrice = 10, 
        soldTickets = 500)
    println(amount)
}

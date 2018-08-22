import java.util.*

fun main(args: Array<String>) {

    print("Write how many cups of coffee you will need: ")

    val scanner = Scanner(System.`in`)
    val cupsAmount = scanner.nextInt()

    println("For $cupsAmount cups of coffee you will need:")

    val waterAmount = 200 * cupsAmount
    val milkAmount = 50 * cupsAmount
    val beansAmount = 15 * cupsAmount

    println("$waterAmount ml of water")
    println("$milkAmount ml of milk")
    println("$beansAmount g of coffee beans")

}

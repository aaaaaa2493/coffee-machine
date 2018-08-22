import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    print("Write how many ml of water the coffee machine has: ")
    val mlWater = scanner.nextInt()

    print("Write how many ml of milk the coffee machine has: ")
    val mlMilk = scanner.nextInt()

    print("Write how many grams of coffee beans the coffee machine has: ")
    val gramBeans = scanner.nextInt()

    print("Write how many cups of coffee you will need: ")
    val cupsAmount = scanner.nextInt()

    val canMake = minOf(mlWater / 200, mlMilk / 50, gramBeans / 15)

    if (canMake == cupsAmount) {
        println("Yes, I can make such amount of coffee")
    }
    else if (canMake > cupsAmount) {
        val additionalCups = canMake - cupsAmount
        println("Yes, I can make such amount of coffee (and even $additionalCups more than that)")
    }
    else {
        println("No, I can make only $canMake cups of coffee")
    }

}

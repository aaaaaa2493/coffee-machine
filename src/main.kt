import java.util.*

var waterAmount = 1200
var milkAmount = 540
var coffeeBeansAmount = 120
var disposableCupsAmount = 9
var moneyAmount = 550

fun printSupplies() {
    println("The coffee machine has:")
    println("$waterAmount of water")
    println("$milkAmount of milk")
    println("$coffeeBeansAmount of coffee beans")
    println("$disposableCupsAmount of disposable cups")
    println("$moneyAmount of money")
}

fun processBuy() {
    val scanner = Scanner(System.`in`)

    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
    val answer = scanner.nextLine()

    val requiredWater: Int
    val requiredMilk: Int
    val requiredCoffeeBeans: Int
    val requiredMoney: Int

    when (answer) {
        "1" -> {
            requiredWater = 250
            requiredMilk = 0
            requiredCoffeeBeans = 16
            requiredMoney = 4
        }
        "2" -> {
            requiredWater = 350
            requiredMilk = 75
            requiredCoffeeBeans = 20
            requiredMoney = 7
        }
        "3" -> {
            requiredWater = 200
            requiredMilk = 100
            requiredCoffeeBeans = 12
            requiredMoney = 6
        }
        "back" -> {
            return
        }
        else -> {
            println("Bad command!")
            return
        }
    }

    when {
        requiredWater > waterAmount -> {
            println("Sorry, not enough water!")
            return
        }
        requiredMilk > milkAmount -> {
            println("Sorry, not enough milk!")
            return
        }
        requiredCoffeeBeans > coffeeBeansAmount -> {
            println("Sorry, not enough coffee beans!")
            return
        }
        disposableCupsAmount < 1 -> {
            println("Sorry, not enough disposable cups!")
            return
        }
    }

    println("I have enough resources, making you a coffee!")

    waterAmount -= requiredWater
    milkAmount -= requiredMilk
    coffeeBeansAmount -= requiredCoffeeBeans
    moneyAmount += requiredMoney
    disposableCupsAmount -= 1
}

fun processFill() {
    val scanner = Scanner(System.`in`)

    print("Write how many ml of water do you want to add: ")
    val mlWater = scanner.nextInt()

    print("Write how many ml of milk do you want to add: ")
    val mlMilk = scanner.nextInt()

    print("Write how many grams of coffee beans do you want to add: ")
    val gramBeans = scanner.nextInt()

    print("Write how many disposable cups of coffee do you want to add: ")
    val cupsAmount = scanner.nextInt()

    waterAmount += mlWater
    milkAmount += mlMilk
    coffeeBeansAmount += gramBeans
    disposableCupsAmount += cupsAmount
}

fun processTake() {
    println("I gave you $moneyAmount$")
    moneyAmount = 0
}

fun main(args: Array<String>) {

    while (true) {
        printSupplies()
        println()

        val scanner = Scanner(System.`in`)
        print("Write action (buy, fill, take, exit): ")
        val answer = scanner.nextLine()

        when (answer){
            "buy" -> processBuy()
            "fill" -> processFill()
            "take" -> processTake()
            "exit" -> return
            else -> {
                println("Bad action!")
            }
        }
    }
}

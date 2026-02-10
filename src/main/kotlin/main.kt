fun main() {

    var preSum = 0
    var sum = 150_000
    var typeCard = "Mastercard"

    if (limitTransfer(preSum, sum)) {
        println("Сумма комиссии составит ${calcTax(typeCard, preSum, sum)} руб.")
        preSum += sum
    } else {
        println("Операция заблокирована, превышены лимиты")
    }
}

fun limitTransfer(preSum: Int, sum: Int): Boolean {
    return when {
        sum > 150_000 -> false
        sum + preSum > 600_000 -> false
        else -> true
    }
}

fun calcTax(typeCard: String = "Mir", preSum: Int = 0, sum: Int): Int {

    var superSum = when {
        preSum >= 75_000 -> sum
        sum + preSum >= 75_000 -> sum + preSum - 75_000
        else -> 0
    }

    return when (typeCard) {
        "Mastercard" -> if (superSum == 0) 0 else (superSum * 0.6 / 100 + 20).toInt()
        "Visa" -> Math.max((sum * 0.75 / 100).toInt(), 35)
        "Mir" -> 0
        else -> 0
    }


}
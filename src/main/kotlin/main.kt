package ru.netology

fun main() {
    applyDiscount(300, false, 1000)
    applyDiscount(300, true, 1000)
    applyDiscount(1300, false, 1000)
    applyDiscount(1300, true, 1000)
    applyDiscount(50000, true, 1000)
}

fun applyDiscount(amountSpent: Int, isMusicFan: Boolean, amount: Int) {
    val discount0: Int
    val discount1: Double
    var discount2 = 0.0
    var string1 = ""
    var string2 = ""
    var string3 = ""
    val payRubl: Int
    val payCopec: Int

    if (isMusicFan) {
        discount2 = 0.01
        string3 = "Применена скидка 'меломан' 1%."
    }

    if (amountSpent < 1000) {
        discount0 = 0
        discount1 = 0.0
    } else if (amountSpent > 1000 && amountSpent < 10001) {
        discount0 = 100
        discount1 = 0.0
        string1 = "Применена скидка 100р."
    } else {
        discount0 = 0
        discount1 = 0.05
        string2 = "Применена скидка 5%."
    }

    val pay = (amount * (1 - discount1) - discount0) * (1 - discount2)

    payRubl = pay.toInt()
    payCopec = ((pay - pay.toInt()) * 100).toInt()

    println(
        "Покупка $amount р. \n $string1 $string2 $string3 " +
                "Окончательная сумма к оплате: $payRubl р. $payCopec коп."
    )
}
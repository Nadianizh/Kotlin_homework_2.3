package ru.netology

fun main() {
    applyDiscount(300, false, 1000)
    applyDiscount(300, true, 1000)
    applyDiscount(1300, false, 1000)
    applyDiscount(1300, true, 1000)
    applyDiscount(50000, true, 1000)
}

fun applyDiscount(amountSpent: Int, isMusicFan: Boolean, amount: Int) {
    val discount100R: Int
    val discount5percent: Double
    var discountMusicFun = 0.0
    var commentDiscount100R  = ""
    var commentDiscount5percent = ""
    var commentDiscountMusicFun = ""
    val payRubl: Int
    val payCopec: Int

    if (isMusicFan) {
        discountMusicFun = 0.01
        commentDiscountMusicFun = "Применена скидка 'меломан' 1%."
    }

    if (amountSpent < 1000) {
        discount100R = 0
        discount5percent = 0.0
    } else if (amountSpent > 1000 && amountSpent < 10001) {
        discount100R = 100
        discount5percent = 0.0
        commentDiscount100R = "Применена скидка 100р."
    } else {
        discount100R = 0
        discount5percent = 0.05
        commentDiscount5percent = "Применена скидка 5%."
    }

    val pay = (amount * (1 - discount5percent) - discount100R) * (1 - discountMusicFun)

    payRubl = pay.toInt()
    payCopec = ((pay - pay.toInt()) * 100).toInt()

    println(
        "Покупка $amount р. \n $commentDiscount100R $commentDiscount5percent $commentDiscountMusicFun " +
                "Окончательная сумма к оплате: $payRubl р. $payCopec коп."
    )
}
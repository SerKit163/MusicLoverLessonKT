package ru.netology

fun main() {
    val purchase = 10010
    val discount = 100
    val percent = 5
    val mLDiscount = 1
    val musicLover = true

    println("Сумма покупки $purchase рублей")

    val amount = if (purchase <= 1000) {
        purchase
    } else if (purchase > 1000 && purchase <= 10000 ) {
        println("Скидка: $discount рублей")
        purchase - discount
    } else {
        println("Скидка: $percent%")
        purchase - (purchase * percent / 100)
    }

    val musicLoverDiscount = if (musicLover) {
        println("Вы наш постоянный покупетель, вам дополнительная скидка 1%")
        amount - (amount * mLDiscount / 100)
    } else {
        amount
    }

    println("Итого с учетом скидки $musicLoverDiscount рублей")
}
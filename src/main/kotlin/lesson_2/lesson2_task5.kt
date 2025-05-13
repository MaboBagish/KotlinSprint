package org.example.lesson_2

import kotlin.math.pow

fun main() {

    var amountOfDeposit: Double = 70000.0
    val interestRate: Double = 16.7
    val depositTerm: Double = 20.0
    var oneYear = 1

    amountOfDeposit = amountOfDeposit * (oneYear + interestRate / ONE_HUNDRED_PROSENT).pow(depositTerm)

    println("${"%.3f".format(amountOfDeposit)}")
}

const val ONE_HUNDRED_PROSENT = 100
package org.example.lesson_2

fun main() {

    var amountOfDeposit: Double = 70000.0
    val interestRate: Double = 16.7
    val depositTerm = 20
    var oneYear = 1

    while (oneYear <= depositTerm) {

        oneYear++
        var incomPerEnd = amountOfDeposit / ONE_HUNDRED_PROSENT * interestRate
        amountOfDeposit = incomPerEnd + amountOfDeposit

    }

    println("${"%.3f".format(amountOfDeposit)}")
}

const val ONE_HUNDRED_PROSENT = 100
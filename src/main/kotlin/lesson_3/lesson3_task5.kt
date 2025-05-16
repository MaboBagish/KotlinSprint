package org.example.lesson_3

fun main() {

    val sentByServer: String = "D2-D4;0"
    val result = sentByServer.split('-', ';')

    val start = result[0]
    val end = result[1]
    val number = result[2]

    val moveNumber = if (number == "0") {
        "Первый ход"
    } else "другой ход"

    println("$moveNumber, пешка $start на $end")

}





package org.example

fun main() {

    println("Таблица умножения. Введите число которое надо умножить")
    val numberToMultiply: Int = readln().toInt()
    var i: Int = 0

    while (i <= 9) {
        i++
        var result = i * numberToMultiply
        println("$numberToMultiply * $i = $result")
    }

}
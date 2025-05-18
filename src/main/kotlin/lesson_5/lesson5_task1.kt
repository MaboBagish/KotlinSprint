package org.example.lesson_5

fun main() {

    println("Для входа в приложение Вам нужно будет ввести результат сложения двух чисел")

    val oneNumber = (0..10).random()
    val twoNumber = (0..10).random()

    println("Первое число $oneNumber + Второе число $twoNumber = какой будет результат ?")
    val answer = readln().toInt()

    val resultat = if ((oneNumber + twoNumber) == answer) "Добро пожаловать" else "Доступ запрещен"
    println(resultat)
}
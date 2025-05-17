package org.example.lesson_5

fun main() {

    println("Для входа в приложение Вам нужно будет ввести результат сложения двух чисел")

    val a = (0..10).random().toInt()
    val b = (0..10).random().toInt()

    println("Первое число $a + Второе число $b = какой будет результат ?")
    val answer = readln().toInt()

    val resultat = if ((a + b) == answer) "Добро пожаловать" else "Доступ запрещен"
    println(resultat)
}
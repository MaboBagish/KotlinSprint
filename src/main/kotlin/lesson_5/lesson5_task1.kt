package org.example.lesson_5

import kotlin.random.Random

fun main() {

    println("Для входа в приложение Вам нужно будет ввести два числа при сложении которых результат будет 5")
    println("Введите первое число")
    val a = Random.nextInt()
    println("Введите второе число")
    val b = Random.nextInt()


    val resultat = if ((a + b) == 5) "Добро пожаловать" else "Доступ запрещен"

    println(resultat)
}
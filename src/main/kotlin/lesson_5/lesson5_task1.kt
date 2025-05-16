package org.example.lesson_5

fun main() {

    println("Для входа в приложение Вам нужно будет ввести два числа при сложении которых результат будет 5")
    println("Введите первое число")
    val a = readln().toInt()
    println("Введите второе число")
    val b = readln().toInt()

    val c = a + b

   val resultat = if (c == 5) "Добро пожаловать" else "Доступ запрещен"

    println(resultat)
}
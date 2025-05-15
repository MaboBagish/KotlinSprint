package org.example.lesson_3

fun main() {

    println("Таблица умножения. Введите число которое надо умножить")
    val numberToMultiply: Int = readln().toInt()

    var counter = 0

    println(
        "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter++)}\n" +
                "$numberToMultiply * $counter = ${numberToMultiply * (counter)}"
    )
}
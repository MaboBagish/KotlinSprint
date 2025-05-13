package org.example

fun main() {

    println("Таблица умножения. Введите число которое надо умножить")
    val numberToMultiply: Int = readln().toInt()

    val one = 1
    val two = 2
    val three = 3
    val four = 4
    val five = 5
    val six = 6
    val seven = 7
    val eight = 8
    val nine = 9

    println(
        "$numberToMultiply * $one = ${numberToMultiply * one}\n" +
                "$numberToMultiply * $two = ${numberToMultiply * two}\n" +
                "$numberToMultiply * $three = ${numberToMultiply * three}\n" +
                "$numberToMultiply * $four = ${numberToMultiply * four}\n" +
                "$numberToMultiply * $five = ${numberToMultiply * five}\n" +
                "$numberToMultiply * $six = ${numberToMultiply * six}\n" +
                "$numberToMultiply * $seven = ${numberToMultiply * seven}\n" +
                "$numberToMultiply * $eight = ${numberToMultiply * eight}\n" +
                "$numberToMultiply * $nine = ${numberToMultiply * nine}"
    )

}
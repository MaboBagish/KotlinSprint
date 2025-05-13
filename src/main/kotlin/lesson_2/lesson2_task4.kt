package org.example.lesson_2

fun main() {

    val crystal = 7
    val iron = 11
    val gain = 20

    val crystalGain = crystal * gain / VALUE_ONE_HUNDRED_PERCENT

    println("Количество бонусных кристаллов в результате действия баффа -- $crystalGain кристалл")

    val ironGain = iron * gain / VALUE_ONE_HUNDRED_PERCENT

    println("Количество бонусного железа в результате действия баффа -- $ironGain железа")

}

const val VALUE_ONE_HUNDRED_PERCENT = 100
package org.example.lesson_1

fun main() {

    val crystal = 7
    val iron = 11
    val gain = 20

    val crystalGain = crystal * gain / VALUE

    println("Количество бонусных кристаллов в результате действия баффа -- "+crystalGain+" кристалл")

    val ironGain = iron * gain / VALUE

    println("Количество бонусного железа в результате действия баффа -- "+ironGain+" железа")

}

const val VALUE = 100
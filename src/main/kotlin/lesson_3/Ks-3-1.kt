package org.example.lesson_3

import kotlin.random.Random

fun main() {

    val name = "Mark"
    val morning = "Good morning!"
    val evening = "Good evening!"

    val morningEvening = arrayOf(morning, evening)
    val random: Int = Random.nextInt(1, 3)
    val morningOrEvening = morningEvening[random - 1]
    val greetings = if (morningOrEvening == morning) {
        "$morning $name"
    } else {
        "$evening $name"
    }

    println(greetings)

}
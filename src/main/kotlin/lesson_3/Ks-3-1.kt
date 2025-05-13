package org.example.lesson_3

fun main() {

    val name = "Mark"
    val morning = "Good morning!"
    val evening = "Good evening!"

    val morningEvening = arrayOf(morning, evening)
    val random: Int = (1..2).random()
    val morningOrEvening = morningEvening[random - 1]
    val greetings = if (morningOrEvening == morning) {
        "$morning $name"
    } else {
        "$evening $name"
    }

    println(greetings)
}
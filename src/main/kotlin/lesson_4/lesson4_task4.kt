package org.example.lesson_4

fun main() {

    val day = 5
    val armAndAbsWorkout = if (day % 2 == 0) false else true
    val legAndBackWorkout = if (day % 2 == 0) true else false

    println("Упражнение для рук: $armAndAbsWorkout\n" +
            "Упражнение для ног: $legAndBackWorkout\n" +
            "Упражнение для спины: $legAndBackWorkout\n" +
            "Упражнение для пресса: $armAndAbsWorkout")
}
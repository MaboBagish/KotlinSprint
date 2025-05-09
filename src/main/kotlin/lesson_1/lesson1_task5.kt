package org.example.lesson_1


fun main() {

    var seconds = 6480

    val remainingMinutes = (seconds % 3600 / sixty)

    val remainingHour = (seconds / 3600)

    val remainingSeconds = (seconds % sixty)

    println("Время проведенное космонавтом в открытом космосе -- $remainingHour:$remainingMinutes:${"%02d".format(remainingSeconds)}")

}

const val sixty = 60
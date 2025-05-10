package org.example.lesson_1


fun main() {

    val seconds = 6480

    val minutes = (seconds / SIXTY) - SIXTY

    val hour = (seconds / SIXTY) / SIXTY

    val remainingSeconds = (seconds % SIXTY)

    println(
        "Время проведенное космонавтом в открытом космосе -- " +
                "${"%02d".format(hour)}:" +
                "${"%02d".format(minutes)}:" +
                "%02d".format(remainingSeconds)
    )

}

const val SIXTY = 60
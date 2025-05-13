package org.example.lesson_2

fun main() {

    var hours = 9
    var minutes = 39
    val travelTime = 457
    val transformationHourInMinutes = hours * NUMBER_OF_SECONDS_IN_A_MINUTE + minutes
    val addTravelTime = transformationHourInMinutes + travelTime
    minutes = addTravelTime % NUMBER_OF_SECONDS_IN_A_MINUTE
    hours = addTravelTime / NUMBER_OF_SECONDS_IN_A_MINUTE
    println("%02d:%02d".format(hours, minutes))

}

const val NUMBER_OF_SECONDS_IN_A_MINUTE = 60
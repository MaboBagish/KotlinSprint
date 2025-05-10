package org.example.lesson_2

fun main() {
    var hours = 9
    var minutes = 39
    val travelTime = 457

    val transformationHourInMinutes = hours * valueMinutesInHour + minutes
    val addTravelTime = transformationHourInMinutes + travelTime

    minutes = addTravelTime % valueMinutesInHour

    hours = addTravelTime / valueMinutesInHour


    println("$hours:$minutes")


}

const val valueMinutesInHour = 60
package org.example.lesson_2

fun main() {

    var hours = 9
    var minutes = 39
    val travelTime = 457
    val transformationHourInMinutes = hours * VALUE + minutes
    val addTravelTime = transformationHourInMinutes + travelTime

    minutes = addTravelTime % VALUE

    hours = addTravelTime / VALUE

    println("${"%02d".format(hours)}:${"%02d".format(minutes)}")

}

const val VALUE = 60
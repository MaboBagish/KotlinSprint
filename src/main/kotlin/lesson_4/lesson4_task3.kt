package org.example.lesson_4

fun main() {

    val sunWeather = true
    val openAwning = true
    val airHumidity = 20
    val сurrentTimeOfYear = "WINTER"

    println("Благоприятные ли условия сейчас для роста бобовый ? " +
            "${if (airHumidity == 20 && sunWeather == true && openAwning == true && сurrentTimeOfYear == "WINTER") true 
            else  false}")

}

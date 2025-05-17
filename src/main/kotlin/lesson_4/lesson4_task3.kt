package org.example.lesson_4

fun main() {

    val sunWeather = true
    val openAwning = true
    val airHumidity = 20
    val сurrentTimeOfWinter = false

    println(
        "Благоприятные ли условия сейчас для роста бобовый ? " +
                "${
                    if (airHumidity == HUMIDITY_20_PERCENT && 
                        sunWeather == PRESENCE_OF_SUNNY_WEATHER &&
                        openAwning == THE_TENT_IS_OPEN && 
                        сurrentTimeOfWinter == CURRENT_SEASON_WINTER) true
                    else false
                }"
    )

}

const val PRESENCE_OF_SUNNY_WEATHER = true
const val THE_TENT_IS_OPEN = true
const val HUMIDITY_20_PERCENT = 20
const val CURRENT_SEASON_WINTER = false

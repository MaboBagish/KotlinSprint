package org.example.lesson_4

fun main() {

    val weightAverage = (35..100)
    val volumeAverage = (0 until 100)
    val weightFirstCargo: Int = 20
    val volumeFirstCargo: Int = 80
    val weightTwoCargo = 50
    val volumeTwoCargo = 100

    println(
        "Груз весом $weightFirstCargo и объемом $volumeFirstCargo соответствует категории Average: ${
            if (weightFirstCargo in weightAverage && volumeFirstCargo in volumeAverage) {
                true
            } else false
        }"
    )
    println(
        "Груз весом $weightTwoCargo и объемом $volumeTwoCargo соответствует категории Average: ${
            if (weightTwoCargo in weightAverage && volumeTwoCargo in volumeAverage) {
                true
            } else false
        }"
    )

}
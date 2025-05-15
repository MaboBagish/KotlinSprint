package org.example.lesson_4

fun main() {

    val weightAverage = 35..100
    val valueAverage = 0 until 100

    val weightCargoOne = 20
    val valueCargoOne = 80
    val weightCargoTwo = 50
    val valueCargoTwo = 100

    println(
        "Вес первого груза $weightCargoOne c объемом $valueCargoOne соответствует категории Average" +
                " ${if (weightCargoOne in weightAverage && valueCargoOne in valueAverage) true else false}"
    )

    println(
        "Вес первого груза $weightCargoTwo c объемом $valueCargoTwo соответствует категории Average" +
                " ${if (weightCargoTwo in weightAverage && valueCargoTwo in valueAverage) true else false}"
    )
}
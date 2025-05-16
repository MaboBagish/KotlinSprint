package org.example.lesson_4

fun main() {

    val day = 5
    val typeOfTraining = if (day % 2 == 0) false else true


    println("Упражнение для рук: ${if(typeOfTraining == true) true else false}\n" +
            "Упражнение для ног: ${if(typeOfTraining == true) false else true}\n" +
            "Упражнение для спины: ${if(typeOfTraining == true) false else true}\n" +
            "Упражнение для пресса: ${if (typeOfTraining == true) true else false}\n")
}
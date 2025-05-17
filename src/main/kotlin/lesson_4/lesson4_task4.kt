package org.example.lesson_4

fun main() {

    val day = 5

    println(
        "Упражнение для рук: ${if (day % 2 != 0) true else false}\n" +
        "Упражнение для ног: ${if (day % 2 != 0) false else true}\n" +
        "Упражнение для спины: ${if (day % 2 != 0) false else true}\n" +
        "Упражнение для пресса: ${if (day % 2 != 0) true else false}\n"
    )

}
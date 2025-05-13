package org.example.lesson_3

fun main() {

    val sentByServer: String = "D2-D4;0"

    val a = sentByServer[0]
    val b = sentByServer[1]
    val c = sentByServer[3]
    val e = sentByServer[4]
    val f: Int = sentByServer[6].digitToInt()
    val startPosition = "$a$b"
    val finishPosition = "$c$e"
    val moveNumber = if (f == 0){ "Первый ход"
    }else "другой ход"

    println("$moveNumber, пешка $startPosition на $finishPosition")

}





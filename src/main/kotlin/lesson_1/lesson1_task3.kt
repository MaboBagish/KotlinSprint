package org.example.lesson_1

fun main(){

    val year = 1961
    var hour: String = "09"
    var minute: String = "07"

    println("Год полета Юрия Гагарина -- $year год\n" +
            "Час взлета -- $hour часов\n" +
            "Минута взлета -- $minute минут")

    hour = "10"
    minute = "55"

    println("Время посадки -- $hour:$minute")

}
package org.example.lesson_1

import jdk.internal.net.http.common.Log

fun main(){

    var seconds = 6480
    println("Время в космосе в секундах -- $seconds секунд")

    val minute = (seconds % 3600/60)
    println("Время в космосе в минутах -- $minute минут")

    val hour = (seconds/3600)
    println("Время в космосе в часах -- $hour часов")

    seconds = seconds %60
    println("Секунды не вошедшие в минуту -- $seconds секунд")

    println("Время проведенное космонавтом в открытом космосе -- $hour:$minute:$seconds")

//    var minute = { seconds: 60 ->
//    }
//    println("Время в космосе в минутах -- $minute минут")
//
//    val hour: String = "01"
//    minute = 40
//    seconds = "00"
//
//    println("Время проведенное космонавтом в открытом космосе -- $hour:$minute:$seconds")

}
package org.example.lesson_4

fun main() {

    val numberOfTables = 13
    val numberOfBookedToday = 13
    val numberOfBookedTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${
            if (numberOfTables == numberOfBookedToday) {
                false
            } else true
        }"
    )
    println(
        "Доступность столиков на завтра: ${
            if (numberOfTables == numberOfBookedTomorrow) {
                false
            } else true
        }"
    )
}
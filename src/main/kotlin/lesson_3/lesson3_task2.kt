package org.example.lesson_3

fun main() {

    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val surname20 = "Андреева"
    val surname22 = "Сидорова"
    val old20 = 20
    val old22 = 22

    println(
        "$surname20 $name $patronymic, $old20 лет\n" +
                "$surname22 $name $patronymic, $old22 года"
    )
}
package org.example.lesson_4

fun main() {

    println("Наличие повреждений корпуса")
    val damage: Boolean = readln().toBoolean()
    println("Текущий состав экипажа")
    val numberOfCrew: Int = readln().toInt()
    println("Количество ящиков с провизией")
    val amountOfProvisions: Int = readln().toInt()
    println("Благоприятность метеоусловий")
    val whitherGood = readln().toBoolean()

    println(
        "${
            if (damage == false && numberOfCrew in 55..70 && amountOfProvisions >= 50 && whitherGood == true) true
            else if (damage == true && numberOfCrew == 70 && amountOfProvisions >= 50 && whitherGood == true) true else false
        } "
    )
}
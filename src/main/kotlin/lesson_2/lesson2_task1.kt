package org.example.lesson_2


fun main() {

    val studentPoint1 = 3
    val studentPoint2 = 4
    val studentPoint3 = 3
    val studentPoint4 = 5
    val numberOfStudents = 4

    val averageScore: Double = ((studentPoint1 + studentPoint2 + studentPoint3 + studentPoint4) / numberOfStudents).toDouble()

    println("Средний балл по английскому в этом классе -- ${"%.2f".format(averageScore)}")

}
package org.example.lesson_2

fun main() {

    val numberOfWorkers = 50
    val numberOfInterns = 30
    val salaryWorkers = 30000
    val salaryInterns = 20000

    val workerCosts = numberOfWorkers * salaryWorkers
    println("Расходы на рабочих -- $workerCosts рублей")

    val internsCosts = numberOfInterns * salaryInterns
    val costs = internsCosts + workerCosts
    println("Общие расходы после прихода интернов -- $costs рублей")

    val averageSalary = (costs / (numberOfInterns + numberOfWorkers))
    println("Средняя зарплата сотрудников после прихода стажеров -- $averageSalary рублей")

}
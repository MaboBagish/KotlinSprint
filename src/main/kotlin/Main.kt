package org.example

import kotlin.math.pow

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val a = 100
    val b: Double = 2.0
    val x = 3

    val c: Double = 100 * (1 + b / 100).pow(x)

    println(c)

}




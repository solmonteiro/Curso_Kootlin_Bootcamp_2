package com.example.curso_kootlin_bootcamp_2

import java.lang.Math.random

fun main() {

    val spices = listOf(
        "curry",
        "pepper",
        "cayenne",
        "ginger",
        "red curry",
        "green curry",
        "red pepper"
    )

    //Create a filter that gets all the curries and sorts them by string length.
    println(spices.sortedBy { it.length })
    //Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
    println(spices.filter { it.startsWith("c") && it.endsWith("e") })
    //Take the first three elements of the list and return the ones that start with 'c'.
    println(spices.take(3).filter { it.startsWith("c") })

    //What is the difference between
//random1 has a value assigned at compile time, and the value never changes when the variable is accessed.
//random2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.

    val random1 = random()
    val random2 = {random()}

    println("O valor de random1 é $random1")
    println("O valor de random2 é $random2")


}
package com.example.curso_kootlin_bootcamp_2

import java.lang.Math.random
import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    dayOfWeek()
    feedTheFish()

    if (args[1].toInt() < 12) println("Bom dia, Kotlin") else {
        println("Boa noite, Kotlin")
    } //Maneira 01 de fazer
    println("${if (args[1].toInt() < 12) "Bom dia, Kotlin" else "Boa noite, Kotlin"}") //Maneira 02 de fazer

}

/*Create a program with a function that returns a fortune cookie message that you can print.

Create a main() function.
From the main() function, call a function, getFortuneCookie(), that returns a String.
Create a getFortuneCookie() function that takes no arguments and returns a String.
In the body of getFortuneCookie(), create a list of fortunes. Here are some ideas:

"You will have a great day!"
"Things will go well for you today."
"Enjoy a wonderful day of success."
"Be humble and all will turn out well."
"Today is a good day for exercising restraint."
"Take it easy and enjoy life!"
"Treasure your friends because they are your greatest fortune."
Below the list, print: "Enter your birthday: "

Hint: Use print(), not println()
Create a variable, birthday.
Read the user's input form the standard input and assign it to birthday. If there is no valid input, set birthday to 1.
Hint: Use readLine() to read a line of input (completed with Enter) as a String.
Hint: In Kotlin, you can use toIntOrNull() to convert a number as a String to an Integer numeric. If the user enters "", toIntOrNull returns null.
Hint: Check for null using the ? operator and use the ?: operator to handle the null case.
Divide the birthday by the number of fortunes, and use the remainder as the index for the fortune to return.
Return the fortune.
In main(), print: "Your fortune is: ", followed by the fortune string.*/

fun dayOfWeek() {

    println("What day is it today?")
    var diaDaSemana = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when (diaDaSemana) {
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sábado")
    }
}

fun feedTheFish(){

    val day=randomDay()

    when(day){
        "Domingo"->println("Today is $day and the fish eat Potato")
        "Segunda"->println("Today is $day and the fish eat Cake")
        "Terça"->println("Today is $day and the fish eat Meat")
        "Quarta"->println("Today is $day and the fish eat Bread")
        "Quinta"->println("Today is $day and the fish eat Beans")
        "Sexta"->println("Today is $day and the fish eat Rice")
        "Sábado"->println("Today is $day and the fish eat Ice Cream")
    }

}

fun randomDay():String{

    val week= listOf("Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado")
    return week[Random().nextInt(7)] //Seleciona um item na lista através do índice indicado randomicamente

}
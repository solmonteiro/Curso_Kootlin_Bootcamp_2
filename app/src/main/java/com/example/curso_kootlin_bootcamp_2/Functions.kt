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
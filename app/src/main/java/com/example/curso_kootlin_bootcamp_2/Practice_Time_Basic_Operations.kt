package com.example.curso_kootlin_bootcamp_2

fun main() {

    peixesAquario()
    testandoNulos()
    usandoWhen()
    usandoWhen2()
    usandoArrays()

    var list1: List<Int?> = listOf(
        1,
        2,
        null,
        null
    ) //Primeira maneira de criar uma lista com elementos nulos (permitindo elementos)
    var list2: List<Int>? = null //A lista inteir É NULA


}

fun peixesAquario() {

    var peixesRestantes = 0
    peixesRestantes = peixesRestantes.plus(71).plus(233).times(2).minus(13)
    val aquariosNecessarios = peixesRestantes.div(30)


    println("Temos $peixesRestantes peixes restantes")
    println("Necessito de $aquariosNecessarios aquários")

}

data class Color(var colorValue: String?)
data class Color2(val colorValue: String)


fun testandoNulos() {

    //Teste Null Check
    var nullTest: Int? = null

    println(
        nullTest?.inc() ?: 0
    )//Aqui usamos o operador Elvis ?: que define a ação do Kotlin caso a variável seja nula.
    nullTest = 1
    println(nullTest?.inc() ?: 0)
}

fun usandoWhen() {
    var welcomeMessage = "Hello and welcome to Kotlin"
    when (welcomeMessage.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect")
        else -> println("Too long!")
    }
}


fun usandoWhen2() {
/*Create a when statement with three comparisons:

If the length of the fishName is 0, print an error message.
If the length is in the range of 3...12, print "Good fish name".
If it's anything else, print "OK fish name".*/

    val fishName = "Sardinha"

    println(
        when (fishName.length) {
            0 -> "Erro"
            in 3..12 -> "Good fish name"
            else -> "Ok fish name"
        }
    )
}

fun usandoArrays() {

    /*Create an integer array of numbers called numbers, from 11 to 15.
Create an empty mutable list for Strings.
Write a for loop that loops over the array and adds the string representation of each number to the list.
Challenge example*/


    val numbers: IntArray = intArrayOf(11, 12, 13, 14, 15)
    var strings: MutableList<String>? = mutableListOf()

    for ((i, value) in numbers.withIndex()) {
        strings?.add(value.toString())
    }

    println("$strings")

    /*How can you use a for loop to create (a list of) the numbers between 0 and 100 that are divisible by 7?*/

    var divisiveis: MutableList<Int> = mutableListOf() //Não pode ser list pois ela é criada na hora de instanciar a variável e não podemos mudar depois

    for (i in 1..100){
        if (i % 7 == 0) {
            divisiveis.add(i)
        }
    }

    println(divisiveis.toList())
}


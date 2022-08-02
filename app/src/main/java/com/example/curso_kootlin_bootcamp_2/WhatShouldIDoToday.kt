package com.example.curso_kootlin_bootcamp_2

fun main() {



    println("Informe seu mood:")
    val meumood:String= readln()
    println(whatShouldIDoToday(meumood)) //go for a walk
    println(whatShouldIDoToday(meumood)) //stay home and rest
    println(whatShouldIDoToday(meumood, "Cloudy")) //whatch series
    println(whatShouldIDoToday(meumood, temperature = 37))//drink water and stay home

}

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24): String {

    return when { //when não precisa de parâmetros
        highTemperature(temperature) -> "drink water and stay home"
        moodGood(mood, weather) -> "go for a walk"
        moodOk(mood, weather) -> "whatch series"
        moodSad(mood) -> "stay home and rest"
        else -> "Stay home and read."
    }
}

fun highTemperature(temperature: Int) = temperature > 35
fun moodGood(mood: String, weather: String) = mood == "happy" && weather == "Sunny"
fun moodOk(mood: String, weather: String) = mood == "happy" && weather == "Cloudy"
fun moodSad(mood: String) = mood == "sad"
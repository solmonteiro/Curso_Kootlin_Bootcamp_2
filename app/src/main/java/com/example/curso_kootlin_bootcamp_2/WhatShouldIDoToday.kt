package com.example.curso_kootlin_bootcamp_2

fun main() {

    println(whatShouldIDoToday("happy")) //go for a walk
    println(whatShouldIDoToday("sad")) //stay home and rest
    println(whatShouldIDoToday("happy", "Cloudy")) //whatch series
    println(whatShouldIDoToday("happy", temperature = 37))//drink water and stay home

}

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24):String {

   return when (mood != "") {
       (temperature > 35) -> "drink water and stay home"
        (mood == "happy" && weather == "Sunny") -> "go for a walk"
        (mood == "happy" && weather == "Cloudy") -> "whatch series"
        (mood == "sad") -> "stay home and rest"
        else -> "Stay home and read."
    }
}
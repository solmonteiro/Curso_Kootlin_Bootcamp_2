package com.example.curso_kootlin_bootcamp_2

fun main() {

    for (i in 1..10) {
        val fortune = getFortune(getBirthday())
        println("Your fortune is $fortune")
        if (fortune == "Take it easy and enjoy life!") break //break interrompe o loop for, não necessitamos de else
    }
}


fun getFortune(birthday:Int): String {

    val listOfFortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    /*Instead of calculating the fortune based on the birthday, use a when statement to assign some fortunes as follows (or use your own conditions):
    If the birthday is 28 or 31...
    If the birthday is in the first week…
    else … return the calculated fortune as before.*/

    return when (birthday) {
        28, 31 -> "Teste 1 deu certo"
         1-> "Teste 2 deu certo"
        else->listOfFortunes[birthday.rem(listOfFortunes.size)]
    }

}

fun getBirthday(): Int {
    print("Informe seu dia de aniversário:")
    return readln().toIntOrNull() ?: 1
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
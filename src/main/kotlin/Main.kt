/** Ponavljanje svih lekacija */

/*fun main() {
    // 1. Mobile notification
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if (numberOfMessages < 100) println("You have $numberOfMessages notifications.")
    else
        println("Your phone is blowing up! You have 99+ notification.")
}*/


/*fun main() {
//    A children's ticket price of $15 for people 12 years old or younger.
//    A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
//    A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
//    A -1 value to indicate that the price is invalid when a user inputs an age outside of the age specifications.
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {

    return when {
        age <= 12 && age >= 0 -> 15
        age in 13..16 -> if (isMonday) 25 else 30
        age >= 61 -> 20
        else -> -1
    }
}*/

/** Stupnjevi */
//There are three main temperature scales used in the world: Celsius, Fahrenheit, and Kelvin.
//In the initial code provided in the following code snippet,
//write a program that converts a temperature from one scale to another with these formulas:
//
//Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
//Kelvin to Celsius: ° C = K - 273.15
//Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15
//Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.
//

/*
fun main() {
    // Fill in the code.
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", conversionFormula = { 9.0 / 5.0 * it + 32 })
    printFinalTemperature(350.0, "Celsius", "Fahrenheit", conversionFormula = { it - 273.15 })
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", conversionFormula = { 5.0 / 9.0 * (it + 32) + 273.15 })
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
*/


/** 5. Song catalog */
//Imagine that you need to create a music-player app.
//Create a class that can represent the structure of a song. The Song class must include these code elements:
//Properties for the title, artist, year published, and play count
//A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
//A method that prints a song description in this format:
//"[Title], performed by [artist], was released in [year published]."

/*
fun main() {
    val song = Song("Magdalena", "Oliver Dragojevic", 1978, 2000)
    song.printDescription()
    println(song.isPopular)
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was realised in $yearPublished")
    }
}
*/

/** Kolekcije */

fun main() {
//    Liste
    val sentence = "I was at school"

//    val list = listOf<String>()
    val list = listOf("matej", "ivan", "matej") // 00:21
    println(list[1]) // ivan

//    val listOfString = sentence.split(" ")
//    println(listOfString)

/**  Setovi - rijetko se koriste */
//    val randomSet = setOf("a", "a", "b") // izbacuje duplikate
//    println(randomSet)

/**    Mape */

//    val userMap = mapOf("oib" to 902139012, "name" to "ivan")
//    println(userMap["oib"])
//
//    printAll<Int>()
}

//fun <T>printAll(collection: Collection<T>){
//
//    collection.forEach {
//        it:T
//        println(it)
//}
//}
//// 10 minuta
//        fun <T>printObject*/

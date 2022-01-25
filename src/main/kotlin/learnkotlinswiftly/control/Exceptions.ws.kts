package learnkotlinswiftly.control

import kotlin.ArithmeticException

/*See what happens?
val numDivZero = 5 / 0
println(numDivZero)*/

//We won't use toIntOrNull in this case
println("Type a number to be converted to string")

try {
    val num1 = readLine()?.toInt()
    println("Number is $num1")
} catch (e: NumberFormatException) {
    println("Invalid number")
} finally {
    /*Finally block always called, regardless of whether exception thrown*/
    println("Done work")
}


//To throw an exception
throw Exception()

//Or more specific
throw ArithmeticException()
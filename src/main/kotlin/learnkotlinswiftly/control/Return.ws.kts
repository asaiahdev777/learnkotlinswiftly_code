package learnkotlinswiftly.control

fun typeYourName() {
    println("Type your name")

    val name = readLine()

    if (name != null) {
        if (name.equals("Monster", ignoreCase = true)) {
            println("So sorry, but we won't waste our time with a monster.")
            //Returns from this function (stops executing this function)
            return
        } else println("Hello $name!")
    }
}

typeYourName()
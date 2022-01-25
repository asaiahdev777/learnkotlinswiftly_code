package learnkotlinswiftly.control

println("Type the number of sides your shape has.")
val numberOfSides = readLine()?.toIntOrNull()

when {
    numberOfSides == null -> println("Invalid number.")
    numberOfSides < 3 -> println("How can a shape have $numberOfSides side?")
    numberOfSides == 3 -> println("Triangle")
    numberOfSides == 4 -> println("Quadrilateral")
    numberOfSides == 5 -> println("Pentagon")
    numberOfSides == 6 -> println("Hexagon")
    numberOfSides == 7 -> println("Heptagon")
    numberOfSides == 8 -> println("Octagon")
    numberOfSides == 9 -> println("Nonagon")
    numberOfSides == 10 -> println("Decagon")
    //For when statements, else isn't mandatory
    else -> println("Asaiah doesn't know!")
}
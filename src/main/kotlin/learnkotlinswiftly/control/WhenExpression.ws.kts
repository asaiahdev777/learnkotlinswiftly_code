package learnkotlinswiftly.control

println("Type the number of sides your shape has.")
val numberOfSides = readLine()?.toIntOrNull()

val message = when {
    numberOfSides == null -> "Invalid number."
    numberOfSides < 3 -> "How can a shape have $numberOfSides side?"
    numberOfSides == 3 -> "Triangle"
    numberOfSides == 4 -> "Quadrilateral"
    numberOfSides == 5 -> "Pentagon"
    numberOfSides == 6 -> "Hexagon"
    numberOfSides == 7 -> "Heptagon"
    numberOfSides == 8 -> "Octagon"
    numberOfSides == 9 -> "Nonagon"
    numberOfSides == 10 -> "Decagon"
    //For when expression, else is MANDATORY
    else -> "Asaiah doesn't know!"
}
println(message)
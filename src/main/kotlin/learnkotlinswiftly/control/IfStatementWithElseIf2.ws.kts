package learnkotlinswiftly.control

println("Type the number of sides your shape has.")
val numberOfSides = readLine()?.toIntOrNull()

val message = if (numberOfSides == null) "Invalid number."
else if (numberOfSides < 3) "How can a shape have $numberOfSides sides?"
else if (numberOfSides == 3) "Triangle"
else if (numberOfSides == 4) {
    println("A square is a kind of quadrilateral")
    "Quadrilateral" //This is what's returned
}
else if (numberOfSides == 5) "Pentagon"
else if (numberOfSides == 6) "Hexagon"
else if (numberOfSides == 7) {
    println("The lucky number")
    "Heptagon" //This is what's returned
}
else if (numberOfSides == 8) "Octagon"
else if (numberOfSides == 9) "Nonagon"
else if (numberOfSides == 10) "Decagon"
else "Asaiah doesn't know!" //Else is mandatory for an if expression

println(message)
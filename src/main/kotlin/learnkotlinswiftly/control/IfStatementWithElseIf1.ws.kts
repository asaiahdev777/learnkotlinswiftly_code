package learnkotlinswiftly.control

println("Type the number of sides your shape has.")
val numberOfSides = readLine()?.toIntOrNull()

if (numberOfSides == null) println("Invalid number.")
else if (numberOfSides < 3) println("How can a shape have $numberOfSides side?")
else if (numberOfSides == 3) println("Triangle")
else if (numberOfSides == 4) println("Quadrilateral")
else if (numberOfSides == 5) println("Pentagon")
else if (numberOfSides == 6) println("Hexagon")
else if (numberOfSides == 7) println("Heptagon")
else if (numberOfSides == 8) println("Octagon")
else if (numberOfSides == 9) println("Nonagon")
else if (numberOfSides == 10) println("Decagon")
else println("Asaiah doesn't know!")
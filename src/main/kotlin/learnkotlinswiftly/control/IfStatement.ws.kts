package learnkotlinswiftly.control

println("Type the number of sides your shape has.")
val numberOfSides = readLine()?.toIntOrNull()

//If numberOfSides is not null AND it is at least to 3
if (numberOfSides != null && numberOfSides >= 3) {
    println("This is a polygon")
}

//Braces aren't mandatory if content of branches is 1 statement
if (numberOfSides != null && numberOfSides >= 3) println("Yes, you are right fellow. This is a polygon indeed!")
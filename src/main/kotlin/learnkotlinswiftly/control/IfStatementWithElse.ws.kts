package learnkotlinswiftly.control

println("Type the number of sides your shape has.")
val numberOfSides = readLine()?.toIntOrNull()

//If numberOfSides is not null AND it is at least to 3
if (numberOfSides != null && numberOfSides >= 3) println("This is a polygon")
else println("Come on, you know a shape can not have $numberOfSides sides!")

//More concise version using the if-expression
val message = if (numberOfSides != null && numberOfSides >= 3) "Polygon" else "Are you squirrels?"
println(message)
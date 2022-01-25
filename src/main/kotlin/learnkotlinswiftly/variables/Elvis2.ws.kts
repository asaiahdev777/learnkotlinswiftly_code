package learnkotlinswiftly.variables

println("Type your age")
val yourAge = readLine()?.toIntOrNull()
println(yourAge ?: "You typed an invalid age")
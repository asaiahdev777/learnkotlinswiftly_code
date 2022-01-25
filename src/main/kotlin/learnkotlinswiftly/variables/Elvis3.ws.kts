package learnkotlinswiftly.variables

println("Type your age")
println(readLine()?.toIntOrNull() ?: "You typed an invalid age")
package learnkotlinswiftly.variables

println("Type your age: ")

val typedName = readLine()
val name = typedName ?: "" //if typedName not null, return typedName; if not, return ""
val age = name.toIntOrNull() //if name can't be parsed as Int, return null
println(age ?: "Invalid age. ") //if age not null, return age; if not, return "Invalid age."
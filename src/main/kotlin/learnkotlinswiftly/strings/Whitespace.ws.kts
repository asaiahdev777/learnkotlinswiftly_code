package learnkotlinswiftly.strings

val myString = "   Hi my name is Asaiah  "

println(myString.isEmpty()) //To find if string has no characters
println(myString.isNotEmpty()) //To find if string has characters

println(myString.isBlank()) //To find if string is only whitespace
println(myString.isNotBlank()) //To find if string is not only whitespace

println(myString.trimStart()) //To trim whitespace from start of string
println(myString.trimEnd()) //To trim whitespace from the end of string
println(myString.trim()) //To trim whitespace from both sides of string
package learnkotlinswiftly.strings

val greeting = "Hi! My name is Asaiah"

println(greeting.first()) //To get first character
println(greeting.last()) //To get last character
println(greeting.take(4)) //To get x first characters
println(greeting.takeLast(4)) //To get x last characters
println(greeting.drop(4)) //To get string without x first characters
println(greeting.dropLast(4)) //To get string without x last characters

//First element/character = at index 0

//To get a section of a string
println(greeting.substring(0, 2)) //from 1st char up to, but not including 3rd char
//To get a section of a string
println(greeting.substring(1)) //from 2nd char to the end
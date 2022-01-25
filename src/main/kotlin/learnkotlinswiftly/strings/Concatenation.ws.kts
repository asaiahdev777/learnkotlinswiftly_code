package learnkotlinswiftly.strings

val greeting = "Hello world"

val addedStrings1 = greeting + ". How are you?" //Use + to add strings
println(addedStrings1)

val addedStrings2 = "$greeting. How are you?" //Use $ to insert a variable into a string
println(addedStrings2)

val addedStrings3 = "${greeting.uppercase()}. How are you?" //Use ${} to insert an expression into a string
println(addedStrings3)
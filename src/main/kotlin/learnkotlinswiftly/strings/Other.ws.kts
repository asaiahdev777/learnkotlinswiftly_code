package learnkotlinswiftly.strings

val greeting = "Hi! My name is Asaiah"

println(greeting.count()) //To get the size/length of a string
println(greeting.random()) //To get a random character from a string
println(greeting.repeat(3)) //To repeat a string
println(greeting.split(" ", "!")) //To split a string by delimiter(s)
println(greeting.chunked(4)) //To chunk a string into similarly sized pieces (each piece will have a max length of 4)
package learnkotlinswiftly.variables

var thisIsAString = "Hello"
//thisIsAString = 9 //Int can't be assigned to a String

//Any = supertype of all variable types
var thisCanBeAnything: Any = 9 //Possible to change type, because type is Any
println(thisCanBeAnything::class) //Print the type of variable

thisCanBeAnything = "Hello"
println(thisCanBeAnything::class) //Print the type of variable

thisCanBeAnything = Unit //Unit is not null. Unit means empty
println(thisCanBeAnything::class)
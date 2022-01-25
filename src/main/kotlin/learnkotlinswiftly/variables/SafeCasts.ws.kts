package learnkotlinswiftly.variables

val number : Any = 7

val returnAnythingAsString = number as? String //If variable can't be cast, null returned
println(returnAnythingAsString ?: "Sorry, but number can't be cast to String")

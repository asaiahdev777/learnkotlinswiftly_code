package learnkotlinswiftly.variables

val number : Any = 7
println(number)

val anythingAsAnInt = number as Int //To cast variable to different type, use as operator
println(anythingAsAnInt)

//Crashes; 7 can't be cast to String
/*val numberAsString = number as String 
println(numberAsString)*/
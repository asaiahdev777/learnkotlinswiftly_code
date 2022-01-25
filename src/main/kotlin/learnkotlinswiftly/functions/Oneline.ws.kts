package learnkotlinswiftly.functions

//A one-liner function
fun getMyName1() = "Asaiah Toutouyoutte".uppercase() //Compiler infers that return type is String

//A one-liner function
fun getMyName2(): String = "Asaiah Toutouyoutte" //Return type explicitly set

//A one-liner function
fun printMyName() = println(getMyName1()) //println returns nothing, so return type is Unit

//A one-liner function
fun getMyAge(dateOfBirth : Int) : Int = 2021 - dateOfBirth //Return type explicitly set

//Another one-liner function, with the return type annotation omitted
fun returnMyAge(dateOfBirth : Int) = 2021 - dateOfBirth //Compiler infers an Int is returned

println(getMyName1())
println(getMyName2())
printMyName()
println(getMyAge(2004))
println(returnMyAge(2004))
package learnkotlinswiftly.functions

//To declare a function that takes arguments and returns something
fun getLengthOfMyName(firstName: String, lastName: String): Int {
    return firstName.length + lastName.length
}

//To call a function with arguments: functionName(arguments separated by commas)
val lengthOfMyName = getLengthOfMyName("Asaiah", "Toutouyoutte")
println(lengthOfMyName)
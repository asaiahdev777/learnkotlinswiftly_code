package learnkotlinswiftly.functions

//To declare a function without arguments and returns something
fun getMyAge() : Int {
    return 2021 - 2004
}

//To call a function without arguments: functionName, then ()
val age = getMyAge()
println(age)

package learnkotlinswiftly.control

println("Type operand 1 for the quotient")
val num1 = readLine()?.toIntOrNull()
println("Type operand 2 for the quotient")
val num2 = readLine()?.toIntOrNull()


if (num1 != null && num2 != null) {
    //Smart-cast here. Compiler can tell num1 & num2 are not null
    val division = num1 / num2
    println(division)
}

val x : Any = "dog"

if (x is String) {
    //x is automatically cast to a String
    println(x.length)
}

if (x !is String) println("X is not a string")
else println(x.uppercase()) //auto-casted to string

//Smart casts with when
when(x) {
    is String -> println(x.uppercase()) //auto-casted to String
    is Int -> println(x - 5) //auto-casted to Int
}
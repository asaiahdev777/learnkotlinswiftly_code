package learnkotlinswiftly.functions

//To declare an extension function: fun ClassType.functionName(parameter1: Type,...): returnType
fun String.returnInformation(prefix: String = "Data"): String {
    val individualCharacters = length
    val numberOfWords = split(" ").size
    //"this" refers to the variable upon which the extension function was called
    return "$prefix: $this\n" +
            "Individual chars: $individualCharacters\n" +
            "Num of words: $numberOfWords"
}

fun String.reversedAndCapitalized() = reversed().uppercase() //compiler infers that a String is returned


val myNameReversedUppercase = "Asaiah Toutouyoutte".reversedAndCapitalized()
println(myNameReversedUppercase)

println(Nothing::class.java)

println("Get up, stand up for your rights. Don't let down the fight!".returnInformation())
println("Get up, stand up for your rights. Don't let down the fight!".returnInformation("Info"))

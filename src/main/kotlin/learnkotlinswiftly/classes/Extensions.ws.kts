package learnkotlinswiftly.classes

//An extension property
val String.reversedAndCapitalized get() = reversed().uppercase() //compiler infers that a String is returned

val String.wordCount
    //Return type is explicitly set here (mandatory, because {} are used)
    get(): Int {
        return split("").size
    }

//Return type is explicitly set here (redundant, not needed)
val String.distinctWordCount get(): Int = split("").distinct().size


println("Asaiah".reversedAndCapitalized)
println("The man is sitting on the stove on the floor".distinctWordCount)
println("As a man thinketh so is he".wordCount)

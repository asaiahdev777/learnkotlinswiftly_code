package learnkotlinswiftly.control

val animal = readLine() ?: ""

//Match animal against the different branches
when (animal) {
    "dog", "cat" -> println("The most popular bets") //if animal == dog || animal == cat, print...
    "parrot", "canary" -> println("Interesting birds")
    else -> println("I don't know much about that kind of animal.")
}

//When-expression makes another cameo appearance
val message = when (animal) {
    "dog", "cat" -> println("The most popular bets") //if animal == dog || animal == cat, print...
    "parrot", "canary" -> println("Interesting birds")
    else -> println("I don't know much about that kind of animal.")
}

println(message)
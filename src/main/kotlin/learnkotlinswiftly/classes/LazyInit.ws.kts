package learnkotlinswiftly.classes

//Number of Hairs will not be computed until it is first accessed
val numberOfHairs by lazy {
    println("Counting the number of hairs on my body!")
    //Pause execution for 5 seconds (simulating work)
    Thread.sleep(5000)
    100_000_000
}

fun tellMeHowManyHairs() {
    val number = numberOfHairs //accessing a lazy variable for the first time triggers its initialization
    println("Total hairs: $number")
    println("Count again: $numberOfHairs") //The variable is already initialized
}

tellMeHowManyHairs()
package learnkotlinswiftly.classes

lateinit var words: List<String>

//Given that words hasn't been assigned yet, the code below would crash
//println(words)

fun loadWordsAndPrint() {
    //To see if a lateinit var is initialized
    val isInitialized = ::words.isInitialized
    println("Initialized: $isInitialized")

    if (!isInitialized) {
        println("Initializing words")
        words = listOf("Kotlin", "Java", "Groovy", "Scala")
    }

    println(words)
}

loadWordsAndPrint()
loadWordsAndPrint()
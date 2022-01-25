package learnkotlinswiftly.strings

//Escape sequences are used to store special characters in strings

//Linebreak -> \n
val stringWithLinebreaks = "Hi\nMy\nname\nis Asaiah"
println(stringWithLinebreaks)

//Tab -> \t
val stringWithTabs = "Stockholm\tSweden\t\nGothenburg\tSweden"
println(stringWithTabs)

//Quote -> \"
val stringWithQuotes = "John said \"What an awesome language\""
println(stringWithQuotes)

//Backslash -> \\
val stringWithBackSlashes = "dogs.com\\whatever\\whatever"
println(stringWithBackSlashes)

//Raw string can contain newlines and any text (no escaping)
val rawString = """
    Hi,     my name is Kotlin.
    A company called Jetbrains (https://jetbrains.com) created me!
    Quote from Asaiah "I love Kotlin"
    Kotlin\Java\Groovy\Scala
    I want a million ${'$'}
""".trimIndent() //to remove extra whitespace in front of each line in the block
println(rawString)
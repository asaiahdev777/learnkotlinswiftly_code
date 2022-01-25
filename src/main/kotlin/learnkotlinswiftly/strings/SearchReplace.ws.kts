package learnkotlinswiftly.strings

val text = "Recently released information from Microsoft gives us a glimpse into the minds of Gen Z"

//Case is usually ignored, unless ignoreCase = true is set

println(text.startsWith("rec")) //To find if string starts with some text
println(text.startsWith("rec", ignoreCase = false)) //To find if string starts with some text
println(text.startsWith("rec", ignoreCase = true)) //To find if string starts with some text

println(text.endsWith("S")) //To find if string ends with some text
println(text.endsWith("S", ignoreCase = false)) //To find if string ends with some text
println(text.endsWith("S", ignoreCase = true)) //To find if string ends with some text

println(text.contains("Minds")) //To find if string contains some text
println(text.contains("Minds", ignoreCase = false)) //To find if string contains some text
println(text.contains("Minds", ignoreCase = true)) //To find if string contains some text
println("Minds" in text) //To find if a string contains some text

println(text.replace("microsoft", "MS")) //To replace some text in a string
println(text.replace("microsoft", "MS", ignoreCase = false)) //To replace some text in a string
println(text.replace("Microsoft", "MS", ignoreCase = true)) //To replace some text within a string
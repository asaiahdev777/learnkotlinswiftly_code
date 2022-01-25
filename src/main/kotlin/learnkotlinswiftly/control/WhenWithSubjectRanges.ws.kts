package learnkotlinswiftly.control

println("Type your age\n")
val age = readLine()?.toIntOrNull()

val message = if (age != null) when (age) {
    in 0..1 -> "Baby"
    in 2..6 -> "Toddler"
    in 7..9 -> "Young Child"
    in 10..11 -> "Preteen"
    in 12..15 -> "Young adolescent"
    in 16..19 -> "Older adolescent"
    in 20..30 -> "Young adult"
    in 31..59 -> "Middle-age adult"
    in 60..120 -> "Senior adult"
    else -> "How is that possible?"
} else "Invalid age"

println(message)
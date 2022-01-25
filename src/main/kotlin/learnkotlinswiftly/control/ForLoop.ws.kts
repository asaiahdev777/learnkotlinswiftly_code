package learnkotlinswiftly.control

val collection = listOf("Programmer", "Asaiah", "Jerry", "Toutouyoutte")

//To loop over items in a collection
for (word in collection) {
    println(word)
}

//To loop over indices in a collection
for (index in collection.indices) {
    println("Index: $index")
}

//Braces can be omitted if body of for loop contains 1 statement only
for (word in collection) println("Word: $word")

//To loop over a range of numbers (counting upwards)
for (number in 1..5) println("Counting up: $number")

//To count from 1 to 20 in steps of 4:
for (number in 1..20 step 4) println("Counting up in steps: $number")

//To loop over a range of numbers (counting downwards)
for (number in 10 downTo 1) println("Counting down: $number")

//To count from 20 to 1 in steps of 4:
for (number in 20 downTo 1 step 4) println("Counting down in steps: $number")
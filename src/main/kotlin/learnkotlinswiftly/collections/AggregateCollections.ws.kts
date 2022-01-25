package learnkotlinswiftly.collections

val numbers = listOf(5, 123, 98, 234, 3, 9)
println(numbers.maxOrNull()) //To get max (if collection is empty, nothing returned)
println(numbers.minOrNull()) //To get min (if collection is empty, nothing returned)
println(numbers.average()) //To get average
println(numbers.sum()) //To get sum
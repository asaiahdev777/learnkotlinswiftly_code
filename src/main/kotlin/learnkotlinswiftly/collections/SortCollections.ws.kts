package learnkotlinswiftly.collections

val letters = mutableListOf("z", "gp", "mlm", "almh", "Aqwery")
println(letters.sorted()) //Return sorted version of list (ascending)
println(letters.sortedDescending()) //Return sorted version of list (descending)
println(letters.sortedWith(compareBy { it.length })) //Return list sorted by length (ascending)
println(letters.sortedWith(compareBy { 1 - it.length })) //Return list sorted by length (descending)
println(letters.sortedBy { it.length }) //Return list sorted by length (ascending)
println(letters.sortedByDescending { it.length }) //Return list sorted by length (descending)

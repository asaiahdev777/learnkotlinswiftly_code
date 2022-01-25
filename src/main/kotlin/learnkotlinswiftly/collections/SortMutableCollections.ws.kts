package learnkotlinswiftly.collections

val letters = mutableListOf("z", "gp", "mlm", "almh", "Aqwery")
//For mutable lists only
letters.sort() //To sort list itself (ascending)
println(letters)

letters.sortDescending() //To sort list itself (descending)
println(letters)

letters.sortWith(compareBy { it.length }) //To sort list itself length (ascending)
println(letters)

letters.sortWith(compareBy { 1 - it.length }) //To sort list itself by length (descending)
println(letters)

letters.sortBy { it.length } //To sort list itself by length (ascending)
println(letters)

letters.sortByDescending { it.length } //To sort list itself by length (descending)
println(letters)
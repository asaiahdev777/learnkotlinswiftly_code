package learnkotlinswiftly.collections

val list = listOf("Cat", "Dog", "Bird", "Squirrel", "Badger", "Ferret")

println(list[0]) //To access an element at an index
println("Cat" in list) //To find if an element is contained
println(list.contains("Cat")) //To find if an element is contained
println(list.indexOf("Pig")) //To return index of an element (if element not found, -1 returned)

println(list.first()) //To return first element
println(list.last()) //To return last element
println(list.lastIndex) //To return last index
println(list.size) //To return size

println(list.isEmpty()) //To find if empty
println(list.isNotEmpty()) //To find if not empty

println(list.take(2)) //To return a list of the first 2 elements
println(list.drop(2)) //To return a list without the first 2 elements
println(list.takeLast(2)) //To return a list of the last 2 elements
println(list.dropLast(2)) //To return a list without the last 2 elements
println(list.subList(1, 3)) //To return a sublist

println(list.reversed()) //To return a reversed version
println(list.shuffled()) //To return a shuffled version
println(list.random()) //To return a random item

println(list.toList()) //To return a copy
println(list.toMutableList()) //To return a mutable copy
println(list.toSet()) //To return a set containing list elements
println(list.toMutableSet()) //To return a mutable set containing list elements
println(list.joinToString("|")) //To return string of list elements

println(list - "Badger") //To return a list with an element removed
println(list + "Canary") //To return a list with an element added
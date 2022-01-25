package learnkotlinswiftly.collections

val mySet = setOf("Cat", "Dog", "Bird", "Squirrel", "Badger", "Ferret")

println(mySet.elementAt(0)) //To access an element at an index
println("Cat" in mySet) //To find if an element is contained
println(mySet.contains("Cat")) //To find if an element is contained
println(mySet.indexOf("Pig")) //To get index of an element

println(mySet.first()) //To get first element
println(mySet.last()) //To get last element
println(mySet.size) //To get size

println(mySet.isEmpty()) //To find if empty
println(mySet.isNotEmpty()) //To find if not empty

println(mySet.take(2)) //To get a set of the first 2 elements
println(mySet.drop(2)) //To get a set without the first 2 elements

println(mySet.reversed()) //To get a reversed version
println(mySet.shuffled()) //To get a shuffled version
println(mySet.random()) //To get a random item

println(mySet.toList()) //To return a copy
println(mySet.toMutableList()) //To return a mutable copy
println(mySet.toSet()) //To return a set containing a set's elements
println(mySet.toMutableSet()) //To return a mutable set containing a set's elements
println(mySet.joinToString("|")) //To return a string of set's elements
println(mySet union setOf("Pencil", "Pen")) //To return the result of merging 2 sets
println(mySet intersect setOf("Pencil", "Cat", "Dog", "Pen")) //To return what's shared in 2 sets
println(mySet subtract setOf("Pencil", "Cat", "Dog", "Pen")) //To return what's not shared in 2 sets
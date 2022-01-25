package learnkotlinswiftly.collections

val mySet = mutableSetOf("Cat", "Dog", "Bird")
val anotherSet = setOf("Firefox", "Edge", "IE", "Chrome")

mySet.add("Pig") //To add an element
mySet.addAll(anotherSet) //To add elements from another collection

mySet.containsAll(anotherSet) //To see if a set contains elements in another set
mySet.remove("Cat") //To remove an element
mySet.clear() //To remove all elements in a set
println(mySet)

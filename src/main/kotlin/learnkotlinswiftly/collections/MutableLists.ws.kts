package learnkotlinswiftly.collections

val list = mutableListOf("Cat", "Dog", "Bird")
val anotherList = listOf("Firefox", "Edge", "IE", "Chrome")

list.remove("Cat") //To remove an element
list.removeAt(0) //To remove an element at an index

list[1] = "Doggy" //To set a list item at a specific index
list.add("Pig") //To add an element
list.addAll(anotherList) //To add elements from another collection

list.containsAll(anotherList) //To see if a list contains elements in another list

list.reverse() //To reverse a list
list.shuffle() //To shuffle a list

list.removeFirst() //To remove first element in a list
list.removeLast() //To remove last element in a list
list.fill("Animal") //To replace all list items with a value
list.clear() //To remove all elements in a list

println(list)

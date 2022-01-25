package learnkotlinswiftly.collections

//A predicate is the lambda function { } that returns a Boolean for each item
val list = (1..50).toList()

//Filtering
println(list.filter { it % 2 == 0 }) //"it" refers to the list item //Returns a list of elements matching the predicate
println(list.filterNot { it % 2 == 0 }) //Return a list of elements that do NOT match the predicate

val strangeList = listOf("Cracker", 45, 1..4, "Tomato", 1245, null, null)
println(strangeList.filterIsInstance(String::class.java)) //Return a list of Strings only
println(strangeList.filterNotNull()) //Return a list only with non-null elements
println(strangeList.all { it is String || it is Int || it is IntRange || it == null }) //Return if all elements match predicate
println(strangeList.any { it == "Puppy" }) //Return if some elements match predicate
println(strangeList.none { it is Char }) //Return if no elements match predicate

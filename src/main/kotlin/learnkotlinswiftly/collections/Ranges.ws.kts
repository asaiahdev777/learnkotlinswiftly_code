package learnkotlinswiftly.collections

val range1 = 1..20

println(range1.first) //To return start of range
println(range1.last) //To return end of range
println(range1.step) //To return step of range

println(range1.contains(34)) //To find if range contains number
println(range1.random()) //To return random element from range

println(range1.toList()) //To return list containing range elements
println(range1.toMutableList()) //To return mutable list containing range elements
println(range1.toSet()) //To return set containing range elements
println(range1.toMutableSet()) //To return mutable set containing range elements

val range2 = 'A'..'Z' step 5
println(range2.step) //To return step of range
println(range2.toList()) //Interesting?

println((50 downTo 7).toList())
println((50 downTo 7 step 3).toList())

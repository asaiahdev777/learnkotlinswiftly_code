package learnkotlinswiftly.numbers

val myByte: Byte = 1 //A Byte (not common)
println(myByte)

val myShort: Short = 1 //A Short (not common)
println(myShort)

val myInteger = 1 //An Int, even though a Byte could hold this value
println(myInteger)

val myLong1 = 1L //A Long (ends with L)
println(myLong1)

val myLong2 = 1000000000000000 //A Long (number too large to fit in an Int)
println(myLong2)

val myLong3 = 1_000_000_000_000_000 //A Long; underscores can separate digits for any number type
println(myLong3)
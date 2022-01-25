package learnkotlinswiftly.strings

val numberString = "89"

println(numberString.toByte()) //To convert to Byte
println(numberString.toByteOrNull()) //To convert to Byte if possible, else return null
println(numberString.toShort()) //To convert to Short
println(numberString.toShortOrNull()) //To convert to Short if possible, else return null

println(numberString.toInt()) //To convert to Int
println(numberString.toIntOrNull()) //To convert to Int if possible, else return null
println(numberString.toLong()) //To convert to Long
println(numberString.toLongOrNull()) //To convert to Long if possible, else return null

println(numberString.toFloat()) //To convert to Float
println(numberString.toFloatOrNull()) //To convert to Float if possible, else return null
println(numberString.toDouble()) //To convert to Double
println(numberString.toDoubleOrNull()) //To convert to Double if possible, else return null

val booleanText = "tRue"
//toBoolean returns true if string is not null and its content is "true" (ignoring case), else it returns false
println(booleanText.toBoolean()) //To convert to Boolean
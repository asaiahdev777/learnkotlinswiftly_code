package learnkotlinswiftly.numbers

val numberToConvert = 500

val numberAsByte = numberToConvert.toByte()
//Why such a strange result?: 500 is too big to fit in a Byte
println("Type: ${numberAsByte::class}, Value: $numberAsByte")

val numberAsShort = numberToConvert.toShort()
println("Type: ${numberAsShort::class}, Value: $numberAsShort")

val numberAsInt = numberToConvert.toInt() //unnecessary conversion, numberToConvert is already an Int
println("Type: ${numberAsInt::class}, Value: $numberAsInt")

val numberAsLong = numberToConvert.toLong()
println("Type: ${numberAsLong::class}, Value: $numberAsLong")

val numberAsFloat = numberToConvert.toFloat()
println("Type: ${numberAsFloat::class}, Value: $numberAsFloat")

val numberAsDouble = numberToConvert.toDouble()
println("Type: ${numberAsDouble::class}, Value: $numberAsDouble")
package learnkotlinswiftly.numbers

import kotlin.math.ln
import kotlin.math.log
import kotlin.math.log10
import kotlin.math.sqrt

val sqrt = sqrt(78.toDouble()) //To find square root (must be Float/Double)
println(sqrt)

val commonLog = log10(45.0) //To find common log (must be Float/Double)
println(commonLog)

val naturalLog = ln(45F) //To find natural log (must be Float/Double)
println(naturalLog)

val log = log(45F, 2F) //To find log of number (number & base must be Float/Double)
println(log)
package learnkotlinswiftly.numbers

import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.sign

val absValue1 = abs(-107) //To find ABS of number
println(absValue1)

val absValue2 = 500.absoluteValue //To find ABS of number
println(absValue2)

val sign1 = sign(-900.0) //To find sign of number (must be Float/Double)
println(sign1)

val sign2 = 900.sign //To find sign of number
println(sign2)
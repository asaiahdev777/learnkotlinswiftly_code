package learnkotlinswiftly.numbers

import kotlin.math.*

println(Math.toRadians(5.0))
println(Math.toDegrees(0.08726646259971647))

//To find sin (angle must in radians & must be Float/Double)
val sin = sin(0.08726646259971647)
println(sin)

//To find cos of an angle (angle must in radians & must be Float/Double)
val cos = cos(0.08726646259971647)
println(cos)

//To find tan of an angle (angle must in radians & must be Float/Double)
val tan = tan(0.08726646259971647)
println(tan)


//To find arcsin of a value (value must be a Float/Double)
val arcsin = Math.toDegrees(asin(0.08715574274765817)) //convert radians to degrees
println(arcsin)

//To find arccos of a value (value must be a Float/Double)
val arccos = Math.toDegrees(acos(0.9961946980917455)) //convert radians to degrees
println(arccos)

//To find arctan of a value (value must be a Float/Double)
val arctan = Math.toDegrees(atan(0.087488663525924)) //convert radians to degrees
println(arctan)
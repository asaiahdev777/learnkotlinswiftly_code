package learnkotlinswiftly.numbers

//Dividing integers always returns an integer (fractional remainders are discarded)
val twoDividedByFive = 2 / 5 //will equal zero, /*highlight*/not/*endhighlight*/ 0.4
println(twoDividedByFive)

//If we want the actual answer, use fractional types
val twoDividedByFiveDouble = 2.0 / 5.0 //returns a Double, 0.4; both operands are Doubles
println(twoDividedByFiveDouble)

//If we want the actual answer, use fractional types
val twoDividedByFiveFloat = 2F / 5F //returns a Float, 0.4; both operands are Float
println(twoDividedByFiveFloat)
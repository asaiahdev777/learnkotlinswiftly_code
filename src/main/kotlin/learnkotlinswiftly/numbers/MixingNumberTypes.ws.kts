package learnkotlinswiftly.numbers

//In operations involving both whole numbers and decimals, resulting number will be of the largest fractional type used
val interestingOperation1 = 30F + 5 / 9.0 * 90L //Double (the largest fractional type used)
println(interestingOperation1)

val interestingOperation2 = 30F + 5 / 9 * 90L //Float (the largest fractional type used)
println(interestingOperation2)
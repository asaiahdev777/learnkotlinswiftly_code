package learnkotlinswiftly.control

val iAmSmart = false
val iLikeMath = true

//If iAmSmart AND iLikeMath
if (iAmSmart && iLikeMath)
    println("I am smart and I like math")

//If either iAmSmart OR iLikeMath = true
else if (iAmSmart || iLikeMath)
    println("I either am smart or I like math")

//If I am NOT smart
else if (!iAmSmart)
    println("I am not smart")

//If I am not smart, AND I don't like math
else if (!iAmSmart && !iLikeMath)
    println("Dumb people usually don't like math")

//If I am NOT smart AND I like math
// OR
// I am smart, AND I don't like math
else if ((!iAmSmart && iLikeMath) || (iAmSmart && !iLikeMath))
    println("That's odd. Dumb people usually hate math, and whizzes are usually good at math.")
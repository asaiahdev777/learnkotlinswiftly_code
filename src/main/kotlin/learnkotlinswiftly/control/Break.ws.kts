package learnkotlinswiftly.control

val numbers = listOf(1, 5, 6, 7, 9, 8, 10)

for (num in numbers) {
    //If the number is even
    if (num % 2 == 0) {
        println("I found an even number: $num")
        //Stop the loop
        break
    }
}

//Loop labels help specify which loop we are specifying
loopA@ for (i in 1..10) {
    loopB@ for (j in 1..10) {
        if (i * j == 15) {
            println("$i times $j equals 15.")
            //Break the outer loop
            break@loopA
        }
    }
}

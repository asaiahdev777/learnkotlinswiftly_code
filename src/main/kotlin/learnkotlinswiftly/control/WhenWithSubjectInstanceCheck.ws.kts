package learnkotlinswiftly.control

val x: Any = "chicken"

//When with subject
when (x) {
    is String -> println(x.uppercase()) //auto-casted to String, so now String methods are callable
    is Int -> println(x.toFloat()) //auto-casted to Int, so now Int methods are callable
}
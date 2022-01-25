package learnkotlinswiftly.classes

//Define a getter/setter underneath the variable
//A setter can be defined without a getter and vice-versa (you don't need to define both)
var name = ""
    set(value) {
        //Log the new value
        println("New name is $value")
        //Set the variable equal to the new value
        field = value
    }

//This variable dynamically returns the person's name
//The variable type is omitted because the compiler can infer it is of type String
val nameMessage1 get() = "The name is $name"

//Here, a type annotation is mandatory, because curly braces are being used
val nameMessage2: String
    get() {
        return "The person's name is $name"
    }

//It is possible to add a (redundant) type annotation if you want to.
val nameMessage3 get() :String = "Your name is $name!"

name = "John"
println(nameMessage1)
println(nameMessage2)
println(nameMessage3)
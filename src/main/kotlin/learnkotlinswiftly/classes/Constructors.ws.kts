package learnkotlinswiftly.classes

//The constructor parameters are between the ()
//If the variables start with val or var, they are member properties that are accessible
//Default arguments are allowed

class Person(
    val firstName: String = "John",
    val lastName: String = "Doe",
    var age: Int,
    middleName: String = "" //not a member property; only a constructor parameter
) {
    //Also a member property, but not provided in constructor
    val fullName = "$firstName $middleName $lastName"

    //Initializer block called when class is created
    init {
        println("I, $firstName am now alive!")
    }
}

//To instantiate a class with a constructor
//You can pass the constructor arguments the same way as for a function
//You can use named parameters and default arguments
val person = Person(age = 17, middleName = "Jerry")

//Class properties are accessed using dot operator
println(person.firstName)
println(person.lastName)
println(person.fullName)
println(person.age)
person.age = 19
println(person.age)

println(Person("A", "T", 17, "T").fullName)

//Won't work because middleName is not a member property
//println(person.middleName)
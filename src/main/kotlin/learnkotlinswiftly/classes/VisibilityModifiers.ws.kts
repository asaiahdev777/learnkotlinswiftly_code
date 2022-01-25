package learnkotlinswiftly.classes

//The private modifier prevents code from outside the class from accessing the method/property
//By default, methods/properties are public
class Person(
    private val firstName: String,
    private val lastName: String,
    val age: Int
) {
    private fun getFullName() = "$firstName $lastName"

    //For public methods, omit the word private
    fun printName() {
        println(getFullName())
    }
}

val person = Person("Asaiah", "Toutouyoutte", 4)
//Can only call public methods
person.printName()
//Can only call access public properties
println(person.age)

//This won't work (not allowed)
//person.firstName

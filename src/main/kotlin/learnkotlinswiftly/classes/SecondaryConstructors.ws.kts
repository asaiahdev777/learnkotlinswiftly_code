package learnkotlinswiftly.classes

class Person(
    var firstName: String = "",
    var lastName: String = "",
    var middleName: String = ""
) {
    //The string passed must have 3 names (or program will crash)
    constructor(fullName: String) : this() {
        val nameSplit = fullName.split(" ")
        firstName = nameSplit[0]
        middleName = nameSplit[1]
        lastName = nameSplit[2]
    }

    //Also a member property, but not provided in constructor
    val fullName = "$firstName $middleName $lastName"
}

//Instantiate the class as usual...
val person = Person("Asaiah Jerry Toutouyoutte")
println(person.firstName)
println(person.middleName)
println(person.lastName)
println(person.fullName)
package learnkotlinswiftly.classes

//Regular class
class Person(private val firstName: String, private val lastName: String) {
    fun printName() = println("$firstName $lastName")
}

//Data class
data class PersonData(private val firstName: String, val lastName: String) {
   fun printName() = println("$firstName $lastName")
}


//Instantiate data classes
val personData1 = PersonData("John", "Doe")
val personData2 = PersonData("John", "Doe")

//Objects considered equal because their constructor properties contain the same data
println(personData1 == personData2)

//The copy method only comes with data classes
val personData3 = personData1.copy(firstName = "Jim") //choose which constructors properties to override
println(personData3)
personData3.printName()


val person1 = Person("John", "Doe")
val person2 = Person("John", "Doe")

//They're not equal (because regular classes determine equality differently than data classes)
println(person1 == person2)
person1.printName()
person2.printName()
package learnkotlinswiftly.classes

class Person(var firstName: String = "John", var lastName: String = "Doe", var age: Int) {

    //This is a member function
    fun printYourName() = println("My name is ${getYourFullName()}")

    //This is a member function
    fun getYourFullName() = "$firstName $lastName"

    //This is a member function
    fun introduceYourself() = println("My name is ${getYourFullName()}, and I am $age years old.")

    //This is a member function
    fun changeYourName(newFirstName: String, newLastName: String) {
        firstName = newFirstName
        lastName = newLastName
    }
}

val person = Person("Asaiah", "Toutoutyoutte", 17)
person.printYourName()
println(person.getYourFullName())
person.changeYourName("Bill", "Dog")
person.printYourName()
person.introduceYourself()
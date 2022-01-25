package learnkotlinswiftly.polymorphism

open class Animal(val age: Int) {
    //Protected means only this and its subclasses can see/access this property
    //Open means it can be overridden
    protected open val name = "Animal"

    //Open means it can be overridden
    open fun eatFood() = println("fEASTing on Food")

    fun printSpecies() = println("I'm a: $name")
}

//To instantiate a sub-class, we need to instantiate its superclass first
class Dog(age: Int) : Animal(age) /*pass the constructor arguments*/ {

    //It's possible to override a val property with a var (NOT VICE-VERSA)
    override var name = "Doggy"

    override fun eatFood() {
        //This calls the superclasse's version of eatFood
        //super.eatFood()
        println("Eating my dog food")
    }

    fun changeName(newName: String) {
        name = newName
    }
}

val animal = Animal(78)
animal.eatFood()
animal.printSpecies()
println(animal is Dog) //false, because Animal is the superclass of Dog

val dog = Dog(120)
dog.eatFood()
dog.printSpecies()
dog.changeName("Bloodhound")
dog.printSpecies()
println(dog.age)
println(dog is Animal)
//dog.name (inaccesible)
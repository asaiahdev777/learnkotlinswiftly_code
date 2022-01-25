package learnkotlinswiftly.classes

//To declare a singleton, use the object keyword
object MyFirstSingleton {
    var number = 0

    init {
        println("Singleton initialized")
    }

    fun incrementNumberAndPrint() {
        number++
        println(number)
    }
}

//To access a singleton's properties/methods
MyFirstSingleton.incrementNumberAndPrint()
println(MyFirstSingleton.number)

MyFirstSingleton.incrementNumberAndPrint()
println(MyFirstSingleton.number)
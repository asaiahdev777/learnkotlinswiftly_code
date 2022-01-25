package learnkotlinswiftly.classes

enum class Continent {
    Africa,
    NorthAmerica,
    SouthAmerica,
    Europe,
    Asia,
    Oceania;

    //Enum constants can also have methods
    fun printYourself() {
        //name and ordinal are built-in properties that come with enums
        //Don't forget, indexes in Kotlin start from 0
        println("I am $name and I am number ${ordinal + 1} in the list of continents")
    }
}

println(Continent.Africa)
println(Continent.NorthAmerica)
println(Continent.SouthAmerica)
println(Continent.Asia)

Continent.Oceania.printYourself()
Continent.Europe.printYourself()

println(Continent.values().toList())
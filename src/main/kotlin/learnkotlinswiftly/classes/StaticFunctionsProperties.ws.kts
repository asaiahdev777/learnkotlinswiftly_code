package learnkotlinswiftly.classes

class Country(
    val name: String,
    val language: String,
    val continent: String,
    val numArmySoldiers: Int,
    val nickname: String = ""
) {
    //All static methods/properties go in here
    companion object {
        //Primitive: String, Char, Byte, Short, Int, Long, Double, Float, Boolean
        //Use const keyword in front of immutable primitive variables to improve performance

        //Compile-time constant must have constant values, so the following is illegal
        //const val illegal = "Illegal".uppercase()
        const val africa = "Africa"
        const val northAmerica = "North America"
        const val southAmerica = "South America"
        const val asia = "Asia"
        const val europe = "Europe"
        const val oceania = "Oceania"
        val availableContinents = listOf(africa, northAmerica, southAmerica, asia, europe, oceania)

        fun printAllContinents() {
            println(availableContinents)
            //See, we can not access member functions/methods ond properties
            //println(soldiersInArmy) //soldiersInArmy is not a static property or method/function
        }
    }
}

//To access static methods/functions and properties
println(Country.availableContinents)
println(Country.africa)
Country.printAllContinents()

//Accessing object properties
val country = Country("China", "Chinese", "Asia", 1_000_000, "Mighty Beijing")
println(country.name)
println(country.numArmySoldiers)
println(country.language)
println(country.continent)
println(country.nickname)
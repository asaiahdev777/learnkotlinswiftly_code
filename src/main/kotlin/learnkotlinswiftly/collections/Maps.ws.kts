package learnkotlinswiftly.collections

val map = mapOf(
    "Volvo" to "Sweden",
    "Audi" to "Germany",
    "Renault" to "France",
    "Ford" to "USA",
) //key to value; keys must be unique


println(map["Volvo"]) //To find a value for a key
println("Ford" in map) //To find if a key is contained
println(map.contains("Audi")) //To find if a key is contained
println(map.containsValue("Japan")) //To find if a value is contained

println(map.size) //To get size
println(map.isEmpty()) //To find if empty
println(map.isNotEmpty()) //To find if not empty
println(map.toList()) //To return a list with keys and values
println(map.toMap()) //To return a copy

println(map.keys) //To get the set of keys
println(map.values) //To get values

println(map - "Audi") //To get a map without a specific key
println(map - listOf("Audi", "Ford")) //To get a map without specific keys
println(map + ("Mazda" to "Japan")) //To add a key,value pair to a map
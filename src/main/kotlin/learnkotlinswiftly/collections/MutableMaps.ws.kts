package learnkotlinswiftly.collections

val map = mutableMapOf(
    "Volvo" to "Sweden",
    "Audi" to "Germany",
    "Renault" to "France",
    "Ford" to "USA",
) //key to value; keys must be unique

val asianCarmakers = mapOf(
    "Honda" to "Japan",
    "KIA" to "South Korea",
    "Suzuki" to "Japan",
    "Nissan" to "Japan"
)

val americanCarmakers = mapOf(
    "Ford" to "USA",
    "Tesla" to "USA",
    "General Motors" to "USA",
)

map["Mazda"] = "Japan" //To add a key with its value
map.putAll(asianCarmakers) //To add contents of one map to another
map += americanCarmakers //To add contents of one map to another
map.remove("Ford") //To remove a key (and it's associated value)
map -= "KIA" //To remove a key (and it's associated value)
println(map)
map.clear() //To empty a map

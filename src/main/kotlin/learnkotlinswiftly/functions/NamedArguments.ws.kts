package learnkotlinswiftly.functions

//Look at this massive method. Calling this function with named arguments is much more manageable.
fun printMyInformation(
    firstName: String,
    middleName: String,
    lastName: String,
    age: Int,
    country: String,
    maternalLanguage: String,
    yearsOfKotlinExperience: Int
) {
    println(
        """
        Hi, I am $firstName $middleName $lastName. I am $age years old, and I am from $country.
        I speak $maternalLanguage and I have $yearsOfKotlinExperience years of Kotlin Experience
    """.trimIndent()
    )
}

//This function call is so long, adding linebreaks improves the readability
printMyInformation(
    firstName = "Asaiah", middleName = "Jerry", lastName = "Toutouyoutte",
    age = 17, country = "Canada",
    maternalLanguage = "English", yearsOfKotlinExperience = 3
)

//You can name some parameters directly, and provide the rest as normal
printMyInformation(
    firstName = "Asaiah", middleName = "Jerry", lastName = "Toutouyoutte",
    17, "Canada", "English", 3
)

//You can also name the parameters out of their default order
printMyInformation(
    lastName = "Toutouyoutte", firstName = "Asaiah", middleName = "Jerry",
    age = 17, maternalLanguage = "English",
    country = "Canada", yearsOfKotlinExperience = 3
)

//Can not mix named and positioned arguments
/*printMyInformation(
    "Toutouyoutte", firstName = "Asaiah", "Jerry",
    age = 17, "English",
    country = "Canada", yearsOfKotlinExperience = 3
)*/

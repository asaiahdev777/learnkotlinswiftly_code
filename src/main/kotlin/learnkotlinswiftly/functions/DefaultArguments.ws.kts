package learnkotlinswiftly.functions

//Look at this massive method. Calling this function with named arguments is much more manageable.
fun printMyInformation(
    firstName: String = "John",
    middleName: String = "Lee",
    lastName: String = "Doe",
    age: Int,
    country: String,
    maternalLanguage: String = "English",
    yearsOfKotlinExperience: Int = 1
) {
    println(
        """
        Hi, I am $firstName $middleName $lastName. I am $age years old, and I am from $country.
        I speak $maternalLanguage and I have $yearsOfKotlinExperience years of Kotlin Experience
    """.trimIndent()
    )
}

//Can omit providing arguments that have a default value
printMyInformation(age = 17, country = "Canada")

//Can override default arguments by providing those arguments (whether you use named or positional arguments)
printMyInformation(
    firstName = "Asaiah", middleName = "Jerry", lastName = "Toutouyoutte",
    age = 17, country = "Canada",
    maternalLanguage = "English", yearsOfKotlinExperience = 3
)
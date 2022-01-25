package learnkotlinswiftly.polymorphism

abstract class Country {
    abstract val officialName: String

    abstract fun holdElections()

    //Abstract functions do not have a body (only allowed in abstract classes)
    abstract fun electHeadOfState(president: String)

    abstract fun holdReferendum()

    open fun invade(country: String) {
        println("Sending troops and tanks to our border with $country.")
    }
}

//An abstract class inheriting from another abstract class doesn't need to implement abstract methods  because the class is abstract itself
abstract class FormerUSSRState : Country() {
    abstract val percentageOfRussianSpeakers: Int

    open fun switchToCapitalism() {
        println("This is going to hurt!")
    }
}

interface NuclearArmed {
    val numberOfWarheads: Int

    fun startAllOutNuclearWar(enemy: String) {
        println("Unleash $numberOfWarheads on $enemy")
    }
}

class Asaiahstan : FormerUSSRState(), NuclearArmed {
    override val officialName = "Democratic People's Republic of Asaiahstan"
    override val percentageOfRussianSpeakers = 70
    override val numberOfWarheads = 150

    override fun holdElections() = println("Rush to the polls!")

    override fun electHeadOfState(president: String) {
        println("$president is the president of the $officialName")
    }

    override fun holdReferendum() = println("Do you agree to join the $officialName")

    override fun invade(country: String) {
        super.invade(country)
        println("We will crush $country")
    }

}

val asaiahstan = Asaiahstan()
println(asaiahstan is NuclearArmed)
println(asaiahstan is FormerUSSRState)
println(asaiahstan is Country)

asaiahstan.holdElections()
asaiahstan.electHeadOfState("Asaiah Toutouyoutte")
asaiahstan.switchToCapitalism()
asaiahstan.holdReferendum()
asaiahstan.invade("Sarahstan")
asaiahstan.startAllOutNuclearWar("Sarahstan")
//etc
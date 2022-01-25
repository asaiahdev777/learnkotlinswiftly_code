package learnkotlinswiftly.polymorphism

abstract class Democracy {

    //This variable MUST be implemented in concrete subclasses
    abstract val kindOfDemocracy: String

    //Abstract functions don't have a body (abstract keyword is only used in abstract classes)
    abstract fun holdElections()

    abstract fun electHeadOfState()

    abstract fun voteOnBill()

    abstract fun holdReferendum()

    fun challengeLaw() {
        println("We are going to court to challenge this unconstitutional law!")
    }
}

class Canada : Democracy() {
    //We have to implement all the abstract methods and properties
    override val kindOfDemocracy = "Federation, constitutional monarchy, republic"

    override fun holdElections() {
        println("It's time for the Liberals and Conservatives to start bickering.")
    }

    override fun electHeadOfState() {
        println("Swear in the Prime Minister (who's actually head of government)")
    }

    override fun voteOnBill() {
        println("House of Commons examines, debates, and votes on bill, then Senate")
    }

    override fun holdReferendum() {
        println("Government asks citizen a question")
    }
}

//This won't work (you can't instantiate an abstract class)
//val democracy = Democracy()
val canada = Canada()
println(canada.kindOfDemocracy)

canada.holdElections()
canada.electHeadOfState()
canada.holdReferendum()
canada.voteOnBill()
canada.challengeLaw()
package learnkotlinswiftly.polymorphism

interface Disk {
    //Properties in interfaces can not have values pre-assigned
    var diskName: String //This property must be implemented in a concrete subclass
}

interface Screen {
    var brightness: Int //This property must be implemented in a concrete subclass
    fun changeBrightness(newBrightness: Int) //This method must be implemented in a concrete subclass
    fun turnScreenOn() = println("Screen is now on!")
}

interface Processor {
    //Default methods are allowed
    fun getCores() = 4
}


class Computer : Processor, Disk, Screen {

    override var diskName = "C:" //Overriden property

    override var brightness = 0 //Overriden property

    //We must implement this method (because no default method available)
    override fun changeBrightness(newBrightness: Int) {
        brightness = newBrightness
    }

    //We can override a default method, so as long as it has the same return type and argument types.
    override fun getCores() = 8
}

val computer = Computer()
//We can access all these methods and properties
println(computer.getCores())
println(computer.diskName)

computer.turnScreenOn()
println(computer.brightness)
computer.changeBrightness(5)
println(computer.brightness)

println(computer is Disk)
println(computer is Screen)
println(computer is Processor)
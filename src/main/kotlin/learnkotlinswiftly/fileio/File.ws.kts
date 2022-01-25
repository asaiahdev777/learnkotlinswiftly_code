package learnkotlinswiftly.fileio

import java.io.File

//Represents a file called "names.txt". Does not create the file!
val path = File("names.txt")

println(path.name) //To return name
println(path.nameWithoutExtension) //To return name minus the extension
println(path.extension) //To return the extension if any
println(path.exists()) //To return if the file exists
println(path.isFile) //To return if the path points to an actual file (the opposite of a folder)
println(path.isDirectory) //To return if the path points to a directory
println(path.absolutePath) //To return the absolute path of the file
println(path.readText()) //To return text read from the file
path.createNewFile() //To create an empty file
path.writeText("Steve\nJobs\nBill\nGates") //To write text to a file
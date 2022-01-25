package learnkotlinswiftly.fileio

import java.io.File

//Represents a folder called "folder". Does not create the folder!
val path = File("folder")
println(path.name) //To return name
println(path.nameWithoutExtension) //To return name minus the extension
println(path.exists()) //To return if the folder exists
println(path.isFile) //To return if the path points to an actual file (the opposite of a folder)
println(path.isDirectory) //To return if the path points to a directory
println(path.absolutePath) //To return the absolute path of the file
println(path.listFiles()?.toList()) //To return the files and subdirectories in the folder as Files
println(path.list()?.toList()) //To return the files and subdirectories in the folder as Strings
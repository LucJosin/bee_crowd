fun main(args: Array<String>) {
var T: Int = readLine()!!.toInt()
    
var H: Int = T / 3600
T = T % 3600
var M: Int = T / 60
var S: Int = T % 60

println("$H:$M:$S")

}
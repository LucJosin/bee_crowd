fun main(args: Array<String>) {
var T: Int = readLine()!!.toInt()

var A: Int = T / 365
T = T % 365
var M: Int = T / 30
var D: Int = T % 30

println("$A ano(s)")
println("$M mes(es)")
println("$D dia(s)")
}
fun main(args: Array<String>) {
var A = 12.0
var T = readLine()!!.toInt()
var V = readLine()!!.toInt()

var Calc = (T * V) / A

println(String.format("%.3f", Calc))
}
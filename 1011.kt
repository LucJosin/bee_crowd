fun main(args: Array<String>) {
var pi: Double = 3.14159
var raio: Double = readLine()!!.toDouble()
var raio3 = raio * raio * raio

var VOLUME = (4.0/3) * pi * raio3

println("VOLUME = " + String.format("%.3f", VOLUME))
}
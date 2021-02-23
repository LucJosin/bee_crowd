fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var A: Double = readLine()!!.toDouble()
var B: Double = readLine()!!.toDouble()
var C: Double = readLine()!!.toDouble()
var pi: Double = 3.14159

var TRIANGULO = (A * C) / 2.0
var CIRCULO = pi * C * C
var TRAPEZIO = ((A + B) * C) / 2.0
var QUADRADO = B * B
var RETANGULO = A * B
  
println("TRIANGULO: " + String.format("%.3f", TRIANGULO))
println("CIRCULO: " + String.format("%.3f", CIRCULO))
println("TRAPEZIO: " + String.format("%.3f", TRAPEZIO))
println("QUADRADO: " + String.format("%.3f", QUADRADO))
println("RETANGULO: " + String.format("%.3f", RETANGULO))
}
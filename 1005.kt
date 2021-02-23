fun main(args: Array<String>) {
var NotaA: Double = readLine()!!.toDouble()
var NotaB: Double = readLine()!!.toDouble()
var Peso1: Double = 3.5
var Peso2: Double = 7.5
var MEDIA = ((NotaA * Peso1) + (NotaB * Peso2)) / 11
    
println("MEDIA = " + String.format("%.5f", MEDIA))
}
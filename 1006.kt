fun main(args: Array<String>) {
var NotaA: Double = readLine()!!.toDouble()
var NotaB: Double = readLine()!!.toDouble()
var NotaC: Double = readLine()!!.toDouble()
var PesoA: Double = 2.0
var PesoB: Double = 3.0
var PesoC: Double = 5.0
var MEDIA = ((NotaA * PesoA) + (NotaB * PesoB) + (NotaC * PesoC)) / 10
    
println("MEDIA = " + String.format("%.1f", MEDIA))
}
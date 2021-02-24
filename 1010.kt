fun main(args: Array<String>) {
var (CP1, NP1, VP1) = readLine()!!.split(' ').map{ it.toDouble() }
var (CP2, NP2, VP2) = readLine()!!.split(' ').map{ it.toDouble() }

var TOTAL = (NP1 * VP1) + (NP2 * VP2)
  
println("VALOR A PAGAR: R$ " + String.format("%.2f", TOTAL))
}
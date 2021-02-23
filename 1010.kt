fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var CP1 = readLine()!!.toInt()
var NP1 = readLine()!!.toInt()
var VP1 = readLine()!!.toDouble()

var CP2 = readLine()!!.toInt()
var NP2 = readLine()!!.toInt()
var VP2 = readLine()!!.toDouble()
var TOTAL = (NP1 * VP1) + (NP2 * VP2)
  
println("VALOR A PAGAR: R$ " + String.format("%.2f", TOTAL))
}
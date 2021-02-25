fun main(args: Array<String>) {
var A: Double = readLine()!!.toDouble() 
var B: Double = readLine()!!.toDouble() 
var C: Double = readLine()!!.toDouble() 
var D: Double = readLine()!!.toDouble() 
var E: Double = readLine()!!.toDouble() 
var F: Double = readLine()!!.toDouble() 
var list = listOf(A, B, C, D, E, F)
var listPositive = ArrayList<Double>()

list.forEach{if (it > 0) listPositive.add(it) }
var size = listPositive.size
println("$size valores positivos")
var media = (listPositive[0] + listPositive[1] + listPositive[2] + listPositive[3]) / listPositive.size
println(String.format("%.1f", media))
}
fun main(args: Array<String>) {
var Name: String = readLine()!!
var Salary: Double = readLine()!!.toDouble()
var Sales: Double = readLine()!!.toDouble()
var Bonus: Double = 0.15
var TOTAL  = (Salary + (Sales * Bonus))
  
println("TOTAL = R$ " + String.format("%.2f", TOTAL))
}
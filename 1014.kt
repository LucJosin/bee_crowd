fun main(args: Array<String>) {
var X = readLine()!!.toInt()
var Y = readLine()!!.toDouble()
    
var CALC1 = X / Y
var FINAL = String.format("%.3f", CALC1)
  
println("$FINAL km/l")
}
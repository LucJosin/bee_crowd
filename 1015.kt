fun main(args: Array<String>) {
var (xp1, yp1) = readLine()!!.split(' ').map{ it.toDouble() }
var (xp2, yp2) = readLine()!!.split(' ').map{ it.toDouble() }
   
var CALC1 = (Math.pow((xp1 - xp2), 2.0) + Math.pow((yp1 - yp2), 2.0))
var CALC2 = Math.sqrt(CALC1)
  
println(String.format("%.4f", CALC2))
}
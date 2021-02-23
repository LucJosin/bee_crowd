fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var xp1 = readLine()!!.toDouble()
var yp1 = readLine()!!.toDouble()
    
var xp2 = readLine()!!.toDouble()
var yp2 = readLine()!!.toDouble()
   
var CALC1 = (Math.pow((xp1 - xp2), 2.0) + Math.pow((yp1 - yp2), 2.0))
var CALC2 = Math.sqrt(CALC1)
  
println(String.format("%.4f", CALC2))
}
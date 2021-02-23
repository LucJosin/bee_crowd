fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var A = readLine()!!.toInt()
var B = readLine()!!.toInt()
var C = readLine()!!.toInt()
    
var CALC1 = (A + B + Math.abs(A - B)) / 2
var CALC2 = (CALC1 + C + Math.abs(CALC1 - C)) / 2
  
println("$CALC2" + " eh o maior")
}
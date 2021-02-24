fun main(args: Array<String>) {
var (A, B, C) = readLine()!!.split(' ').map(String::toInt)
    
var CALC1 = (A + B + Math.abs(A - B)) / 2
var CALC2 = (CALC1 + C + Math.abs(CALC1 - C)) / 2
  
println("$CALC2" + " eh o maior")
}
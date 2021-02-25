fun main(args: Array<String>) {
var A: Int = readLine()!!.toInt()
var B: Int = readLine()!!.toInt()
var C: Int = readLine()!!.toInt()
var D: Int = readLine()!!.toInt()
var E: Int = readLine()!!.toInt()
var list = listOf(A, B, C, D, E)
var evens = ArrayList<Int>() 
    
list.forEach{ if (it % 2 == 0) evens.add(it) }
var size = evens.size
println("$size valores pares")
}
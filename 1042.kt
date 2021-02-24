fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var A: Int = readLine()!!.toInt()
var B: Int = readLine()!!.toInt()
var C: Int = readLine()!!.toInt()
val list = intArrayOf(A, B, C)
val listNormal = intArrayOf(A, B, C)

list.sort()

println(list[0])
println(list[1])
println(list[2])
println("")

println(listNormal[0])
println(listNormal[1])
println(listNormal[2])
}
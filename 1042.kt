fun main(args: Array<String>) {
//Others methods
// var (A, B, C) = readLine()!!.split(' ').map(String::toInt)
// var listOriginal = intArrayOf(A, B, C)
// var list = intArrayOf(A, B, C)

// var (A, B, C) = readLine()!!.split(' ').map{ it.toInt() }
// var listOriginal = intArrayOf(A, B, C)
// var list = intArrayOf(A, B, C)

var (A, B, C) = readLine()!!.split(' ')
var listOriginal = intArrayOf(A.toInt(), B.toInt(), C.toInt())
var list = intArrayOf(A.toInt(), B.toInt(), C.toInt())

list.sort()
list.forEach {println("$it")}
println("")
listOriginal.forEach {println("$it")}
}
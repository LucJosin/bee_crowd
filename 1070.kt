fun main(args: Array<String>) {
var N: Int = readLine()!!.toInt()
var X: Int = N + 11
var (even, odd) = (N..X).partition{ it % 2 == 0}
odd.forEach{ println(it) }
}
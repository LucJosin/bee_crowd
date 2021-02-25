fun main(args: Array<String>) {
var N: Int = readLine()!!.toInt()
var (even, odd) = (1..N).partition{ it % 2 == 0}
odd.forEach{ println(it) }
}
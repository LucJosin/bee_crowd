fun main(args: Array<String>) {
var N: Int = readLine()!!.toInt()

(1..10000).forEach{ if (it % N == 2) println(it) }
}
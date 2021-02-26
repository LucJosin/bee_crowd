fun main(args: Array<String>) {
var N: Int = readLine()!!.toInt()
var MT = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

MT.forEach{ println("$it x $N = " + it * N) }
}
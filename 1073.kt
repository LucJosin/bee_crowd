fun main(args: Array<String>) {
var N: Int = readLine()!!.toInt()
var (evens, odds) = (1..N).partition{ it % 2 == 0}

evens.forEach{ println("$it^2 = " + Math.pow(it.toDouble(), 2.0).toInt()) }	
}
fun main(args: Array<String>) {
var N: Int = readLine()!!.toInt()

for (i in 1..N) {
    var (A, B, C) = readLine()!!.split(' ').map{ it.toDouble() }
    var calc = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5)
    println(String.format("%.1f", calc))
}
}
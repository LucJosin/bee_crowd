fun main(args: Array<String>) {
var N1: Int = readLine()!!.toInt()
var N2: Int = readLine()!!.toInt()
    
var total: Int = 0
    
if (N1 < N2) {
    var (evens, odds) = (N1..N2).partition{ it % 2 == 0}
    odds.forEach{ if (it != N1 && it != N2) total += it }
} else {
    var (evens, odds) = (N2..N1).partition{ it % 2 == 0}
    odds.forEach{ if (it != N1 && it != N2) total += it }
}

println(total)
}
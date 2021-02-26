fun main(args: Array<String>) {
var N: Int = readLine()!!.toInt()
var inT: Int = 0
var outT: Int = 0
   
for (i in 1..N) {
    var X: Int = readLine()!!.toInt()
    if (X >= 10 && X <= 20) {
        inT = inT + 1
    } else {
        outT = outT + 1
    }
}
println("$inT in")
println("$outT out")
}
fun main(args: Array<String>) {
var N: Int = readLine()!!.toInt()
var (total, bTotal, mTotal, fTotal) = listOf(0, 0, 0, 0)
var (bPorc, mPorc, fPorc) = listOf(0.0, 0.0, 0.0)
    
for (i in 1..N) {
    var (Q, T) = readLine()!!.split(' ')
    total += Q.toInt()
    when (T) {
        "C" -> bTotal += Q.toInt()
        "R" -> mTotal += Q.toInt()
        "S" -> fTotal += Q.toInt()
    }
    bPorc = (bTotal * 100.0 / total).toDouble()
    mPorc = (mTotal * 100.0 / total).toDouble()
    fPorc = (fTotal * 100.0 / total).toDouble()
}

println("Total: $total cobaias")
println("Total de coelhos: $bTotal")
println("Total de ratos: $mTotal")
println("Total de sapos: $fTotal")
println("Percentual de coelhos: " + String.format("%.2f", bPorc) + " %")
println("Percentual de ratos: " + String.format("%.2f", mPorc) + " %")
println("Percentual de sapos: " + String.format("%.2f", fPorc) + " %")
}
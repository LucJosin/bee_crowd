fun main(args: Array<String>) {
val A: Int = readLine()!!.toInt()
val B: Int = readLine()!!.toInt()
val C: Int = readLine()!!.toInt()
val D: Int = readLine()!!.toInt()
val E: Int = readLine()!!.toInt()
val list = listOf(A, B, C, D, E)
val (even, odd) = list.partition { it % 2 == 0 }
val (positives, negatives) = list.partition { it > 0 }

val evenSize = even.size
val oddSize = odd.size
val positivesSize = positives.size
val negativesSize = negatives.size - 1 //For some reason partition count 0 as negative, so, i removed 
    
println("$evenSize valor(es) par(es)")
println("$oddSize valor(es) impar(es)")
println("$positivesSize valor(es) positivo(s)")
println("$negativesSize valor(es) negativo(s)")
}
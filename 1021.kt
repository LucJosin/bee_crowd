fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var N: Double = readLine()!!.toDouble()

println("NOTAS:")
println((N / 100.0).toInt().toString() + " nota(s) de R$ 100.00")
N = N % 100
println((N / 50.0).toInt().toString() + " nota(s) de R$ 50.00")
N = N % 50
println((N / 20.0).toInt().toString() + " nota(s) de R$ 20.00")
N = N % 20
println((N / 10.0).toInt().toString() + " nota(s) de R$ 10.00")
N = N % 10
println((N / 5.0).toInt().toString() + " nota(s) de R$ 5.00")
N = N % 5
println((N / 2.0).toInt().toString() + " nota(s) de R$ 2.00")
N = N % 2
println("MOEDAS:")
println((N / 1.0).toInt().toString() + " moeda(s) de R$ 1.00")
N = N % 1
println((N / 0.5).toInt().toString() + " moeda(s) de R$ 0.50")
N = N % 0.5
println((N / 0.25).toInt().toString() + " moeda(s) de R$ 0.25")
N = N % 0.25
println((N / 0.10).toInt().toString() + " moeda(s) de R$ 0.10")
N = N % 0.10
println((N / 0.05).toInt().toString() + " moeda(s) de R$ 0.05")
N = N % 0.05
println((N / 0.01).toInt().toString() + " moeda(s) de R$ 0.01")
}
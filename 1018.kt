fun main(args: Array<String>) {
var A: Int = readLine()!!.toInt()

println(A)
println((A / 100).toString() + " nota(s) de R$ 100,00")
A = A % 100
println((A / 50).toString() + " nota(s) de R$ 50,00")
A = A % 50
println((A / 20).toString() + " nota(s) de R$ 20,00")
A = A % 20
println((A / 10).toString() + " nota(s) de R$ 10,00")
A = A % 10
println((A / 5).toString() + " nota(s) de R$ 5,00")
A = A % 5
println((A / 2).toString() + " nota(s) de R$ 2,00")
A = A % 2
println((A / 1).toString() + " nota(s) de R$ 1,00")

}
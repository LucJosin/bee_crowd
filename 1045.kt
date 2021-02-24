fun main(args: Array<String>) {
var (A, B, C) = readLine()!!.split(' ').map{ it.toDouble() }
var list = doubleArrayOf(A, B, C)

list.sortDescending()

var (A1, B1, C1) = listOf(list[0], list[1], list[2])

if (A1 >= B1 + C1) {
    println("NAO FORMA TRIANGULO") 
} else if (Math.pow(A1, 2.0) == Math.pow(B1, 2.0) + Math.pow(C1, 2.0)) {
    println("TRIANGULO RETANGULO")
} else if (Math.pow(A1, 2.0) > Math.pow(B1, 2.0) + Math.pow(C1, 2.0)) {
    println("TRIANGULO OBTUSANGULO")
} else if (Math.pow(A1, 2.0) < Math.pow(B1, 2.0) + Math.pow(C1, 2.0)) {
    println("TRIANGULO ACUTANGULO")
}
    
if (A1 == B1 && B1 == C1) {
    println("TRIANGULO EQUILATERO")
} else if (A1 == B1 && B1 != C1 || B1 == C1 && C1 != A1) {
    println("TRIANGULO ISOSCELES")
}
}
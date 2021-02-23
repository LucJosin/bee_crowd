fun main(args: Array<String>) {
var A: Double = readLine()!!.toDouble()

if (0 <= A && A <= 25.0) {
    println("Intervalo [0,25]")
} else if (25.0 < A && A <= 50.0) {
    println("Intervalo (25,50]")
} else if (50.0 < A && A <= 75.0) {
    println("Intervalo (50,75]")
} else if (75.0 < A && A <= 100.0) {
    println("Intervalo (75,100]")
} else println("Fora de intervalo")
}
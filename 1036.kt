fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var A: Double = readLine()!!.toDouble()
var B: Double = readLine()!!.toDouble()
var C: Double = readLine()!!.toDouble()
var delta: Double = 0.0

if (A == 0.0) return println("Impossivel calcular")

delta = Math.pow(B, 2.0) - 4 * (A * C)

if (delta > 0) {
    val X1 = (-B + Math.sqrt(delta)) / (2 * A)
    val X2 = (-B - Math.sqrt(delta)) / (2 * A)
    println("R1 = " + String.format("%.5f", X1))
    println("R2 = " + String.format("%.5f", X2))
} else println("Impossivel calcular")
}
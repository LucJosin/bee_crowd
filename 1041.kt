fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var X: Double = readLine()!!.toDouble()
var Y: Double = readLine()!!.toDouble()
    
if (X == 0.0 && Y == 0.0) {
    println("Origem")
} else if (X != 0.0 && Y == 0.0) {
    println("Eixo X")
} else if (X == 0.0 && Y != 0.0) {
    println("Eixo Y")
} else if (X > 0 && Y > 0) {
    println("Q1")
} else if (X < 0 && Y > 0) {
    println("Q2")
} else if (X < 0 && Y < 0) {
    println("Q3")
} else if (X > 0 && Y < 0) {
    println("Q4")
}
}
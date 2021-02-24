fun main(args: Array<String>) {
var (A, B, C) = readLine()!!.split(' ').map{ it.toDouble() } 
    
if (A + B > C && A + C > B && B + C > A) {
    var perimetro = A + B + C
    println("Perimetro = $perimetro")
} else {
    var area = (A + B) * C / 2.0
    println("Area = $area")
}
}
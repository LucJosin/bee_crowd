fun main(args: Array<String>) {
var area: Double = 0.0
var pi: Double = 3.14159
var raio: Double = readLine()!!.toDouble()
var areaRounded = ""
    
area = pi * raio * raio
//areaRounded = Math.round(area * 10000.0) / 10000.0
areaRounded = String.format("%.4f", area)
    
println("A=" + areaRounded)
}
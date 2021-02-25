fun main(args: Array<String>) {
var salary: Double = readLine()!!.toDouble()
    
if (salary >= 0.0 && salary <= 2000.0) {
    println("Isento")
} else if (salary > 2000.0 && salary <= 3000.0) {
    var rend = (salary - 2000) * 8 / 100
    println("R$ " + String.format("%.2f", rend))
} else if (salary > 3000.0 && salary <= 4500.0) {
    salary = salary - 2000
    var rend = 1000 * 8 / 100
    salary = salary - 1000
    var rend2 = salary * 18 / 100
    var taxFinal = rend + rend2
    println("R$ " + String.format("%.2f", taxFinal))
} else if (salary > 4500.0) {
    salary = salary - 2000
    var rend = 1000 * 8 / 100
    var rend2 = 1500 * 18 / 100
    salary = salary - 1000 - 1500
    var rend3 = salary * 28 / 100
    var taxFinal = rend + rend2 + rend3
    println("R$ " + String.format("%.2f", taxFinal))
}
}
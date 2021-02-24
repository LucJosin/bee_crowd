fun main(args: Array<String>) {
var salary: Double = readLine()!!.toDouble()
var porc: Int = 0
var newSalary: Double = 0.0
var added: Double = 0.0
    
if (salary >= 0 && salary <= 400.0) {
    porc = 15
    added = salary * porc / 100
    newSalary = salary + added
} else if (salary > 400.0 && salary <= 800.0) {
    porc = 12
    added = salary * porc / 100
    newSalary = salary + added
} else if (salary > 800.0 && salary <= 1200.0) {
    porc = 10
    added = salary * porc / 100
    newSalary = salary + added
} else if (salary > 1200.0 && salary <= 2000.0) {
    porc = 7
    added = salary * porc / 100
    newSalary = salary + added
} else if (salary > 2000.0) {
    porc = 4
    added = salary * porc / 100
    newSalary = salary + added
}

println("Novo salario: " + String.format("%.2f", newSalary))
println("Reajuste ganho: " + String.format("%.2f", added))
println("Em percentual: $porc %")
}
fun main(args: Array<String>) {
var (cod, amount) = readLine()!!.split(' ').map(String::toInt) 
var foodPrice: List<Double> = listOf(4.00, 4.50, 5.00, 2.00, 1.50)

var total = foodPrice[cod - 1] * amount
println("Total: R$ " + String.format("%.2f", total))

// var (cod, amount) = readLine()!!.split(' ').map(String::toInt)
// var foodPrice: List<Double> = listOf(4.00, 4.50, 5.00, 2.00, 1.50)
    
// when (cod) {
//     1 -> println("Total: R$ " + String.format("%.2f", foodPrice[cod - 1] * amount))
//     2 -> println("Total: R$ " + String.format("%.2f", foodPrice[cod - 1] * amount))
//     3 -> println("Total: R$ " + String.format("%.2f", foodPrice[cod - 1] * amount))
//     4 -> println("Total: R$ " + String.format("%.2f", foodPrice[cod - 1] * amount))
//     5 -> println("Total: R$ " + String.format("%.2f", foodPrice[cod - 1] * amount))
// }
}
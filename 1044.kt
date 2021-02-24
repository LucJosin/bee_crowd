fun main(args: Array<String>) {
var (A, B) = readLine()!!.split(' ').map(String::toInt)

if (A % B == 0 || B % A == 0) {
    println("Sao Multiplos")
} else println("Nao sao Multiplos")	
}
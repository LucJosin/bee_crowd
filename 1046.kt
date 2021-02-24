fun main(args: Array<String>) {
var (A, B) = readLine()!!.split(' ').map(String::toInt)

var calc: Int
    
if (A > B || A == B) {
    calc = 24 - A + B
    println("O JOGO DUROU $calc HORA(S)")
} else {
    calc = 24 - A + B - 24
    println("O JOGO DUROU $calc HORA(S)")
}
}
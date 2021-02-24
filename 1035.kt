fun main(args: Array<String>) {
var (A, B, C, D) = readLine()!!.split(' ').map(String::toInt)


if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
    println("Valores aceitos")
} else println("Valores nao aceitos")
}
fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var A: Int = readLine()!!.toInt()
var B: Int = readLine()!!.toInt()
var C: Int = readLine()!!.toInt()
var D: Int = readLine()!!.toInt()

if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
    println("Valores aceitos")
} else println("Valores nao aceitos")
}
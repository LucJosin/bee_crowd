fun main(args: Array<String>) {
var N: Int = readLine()!!.toInt()
   
for (i in 1..N) {
    var X: Int = readLine()!!.toInt()
    if (X == 0) {
        println("NULL")
    } else if (X % 2 == 0 && X > 0) {
        println("EVEN POSITIVE")
    } else if (X % 2 == 0 && X < 0) {
        println("EVEN NEGATIVE")
    } else if (X % 2 != 0 && X > 0) {
        println("ODD POSITIVE")
    } else if (X % 2 != 0 && X < 0) {
        println("ODD NEGATIVE")
    }
}
}
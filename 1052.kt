fun main(args: Array<String>) {
var month: Int = readLine()!!.toInt()
var months = listOf("January", "February", "March", "April",
                    "May", "June", "July", "August",
                    "September", "October", "November", "December")
    
if (month >= 1 && month <= 12) {
    println(months[month - 1])
}

//Other Method
// var month: Int = readLine()!!.toInt()
    
// when (month) {
//     1 -> println("January")
//     2 -> println("February")
//     3 -> println("March")
//     4 -> println("April")
//     5 -> println("May")
//     6 -> println("June")
//     7 -> println("July")
//     8 -> println("August")
//     9 -> println("September")
//     10 -> println("October")
//     11 -> println("November")
//     12 -> println("December")
// }
}
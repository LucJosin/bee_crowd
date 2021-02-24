fun main(args: Array<String>) {
var A: String = readLine()!!
var B: String = readLine()!!
var C: String = readLine()!!

if (A == "vertebrado") {
    if (B == "ave") {
        if (C == "carnivoro") {
            println("aguia")
        } else {
            println("pomba")
        }
    } else {
        if (C == "onivoro") {
            println("homem")
        } else {
            println("vaca")
        }
    }
} else {
    if (B == "inseto") {
        if (C == "hematofago") {
            println("pulga")
        } else {
            println("lagarta")
        }
    } else {
        if (C == "hematofago") {
            println("sanguessuga")
        } else {
            println("minhoca")
        }
    }
}
}
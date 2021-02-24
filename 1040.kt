fun main(args: Array<String>) {
//For some reason Uri don't accept this code
var (N1, N2, N3, N4) = readLine()!!.split(' ').map{ it.toDouble() }
    
var media: Double = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / (1 + 2 + 3 + 4)
println("Media: " + String.format("%.1f", media))

if (media >= 7.0) {
	println("Aluno aprovado.")
} else if (media < 5.0) {
    println("Aluno reprovado.")
} else if (media >= 5.0 && media <= 6.9) {
    println("Aluno em exame.")
    var N5: Double = readLine()!!.toDouble()
    println("Nota do exame: $N5")
    var newN: Double = (media + N5) / 2
    if (newN >= 5.0) {
        println("Aluno aprovado.")
    } else if (newN <= 4.9) {
        println("Aluno reprovado.")
    }
    println("Media final: $newN")
}
}
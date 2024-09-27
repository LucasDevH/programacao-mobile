fun main() {
    print("Digite um número inteiro para ver sua tabuada: ")
    val num = readLine()?.toIntOrNull()

    if (num != null) {
        for (i in 1..10) {
            val resultado = num * i
            println("$num x $i = $resultado")
        }
    } else {
        println("Entrada inválida! Por favor, insira um número inteiro válido.")
    }
}

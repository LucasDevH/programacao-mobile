fun main() {
    print("Digite um número inteiro: ")
    val num = readLine()?.toIntOrNull()

    if (num != null) {
        when {
            num < 0 -> println("O número é menor que 0.")
            num in 0..10 -> println("O número está entre 0 e 10.")
            num in 11..20 -> println("O número está entre 11 e 20.")
            num > 20 -> println("O número é maior que 20.")
        }
    } else {
        println("Entrada inválida! Por favor, insira um número inteiro válido.")
    }
}

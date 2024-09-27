fun main() {
    print("Digite um número inteiro: ")
    val numInt = readLine()?.toIntOrNull()

    print("Digite um número decimal: ")
    val numDecimal = readLine()?.toDoubleOrNull()

    if (numInt != null && numDecimal != null) {

        val intToDecimal = numInt.toDouble()

        val decimalToInt = numDecimal.toInt()

        println("O número inteiro $numInt convertido para decimal: $intToDecimal")
        println("O número decimal $numDecimal convertido para inteiro: $decimalToInt")
    } else {
        println("Entrada inválida! Por favor, insira valores numéricos corretos.")
    }
}

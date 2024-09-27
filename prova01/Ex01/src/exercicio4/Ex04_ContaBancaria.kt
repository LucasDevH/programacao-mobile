package exercicio4

class ContaBancaria(val titular: String, val numero: Int, var saldo: Double) {

    // Método para depósito
    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$$valor realizado com sucesso.")
        } else {
            println("Valor de depósito inválido!")
        }
    }

    // Método para saque
    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso.")
        } else {
            println("Saque inválido. Verifique o saldo ou o valor inserido.")
        }
    }

    // Método para consulta de saldo
    fun consultarSaldo() {
        println("Saldo atual: R$$saldo")
    }

    // Método para exibir as informações da conta
    fun exibirInformacoes() {
        println("Titular: $titular")
        println("Número da conta: $numero")
        println("Saldo: R$$saldo")
    }
}

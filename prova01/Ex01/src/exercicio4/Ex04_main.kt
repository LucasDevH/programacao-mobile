package exercicio4

fun main() {

    val conta = ContaBancaria(titular = "Lucas Cachel", numero = 12345, saldo = 1000.0)

    conta.exibirInformacoes()

    conta.depositar(500.0)
    conta.consultarSaldo()

    conta.sacar(300.0)
    conta.consultarSaldo()

    conta.sacar(1500.0)
    conta.consultarSaldo()

    conta.exibirInformacoes()
}

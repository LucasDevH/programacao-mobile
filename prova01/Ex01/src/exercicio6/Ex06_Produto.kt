package exercicio6

class Produto(val nome: String, val preco: Double) : Comparable<Produto> {
    override fun compareTo(other: Produto): Int {
        return this.preco.compareTo(other.preco)
    }

    override fun toString(): String {
        return "$nome: R$$preco"
    }
}

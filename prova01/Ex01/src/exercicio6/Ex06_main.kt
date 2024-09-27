package exercicio6

fun main() {
    val pessoas = listOf(
        Pessoa("João", 30),
        Pessoa("Lucas", 23),
        Pessoa("Victor", 35)
    )

    val pessoasOrdenadas = pessoas.sortedWith { p1, p2 -> p1.compareTo(p2) }
    println("Pessoas ordenadas por idade:")
    pessoasOrdenadas.forEach { println(it) }

    val produtos = listOf(
        Produto("Produto A", 50.0),
        Produto("Produto B", 30.0),
        Produto("Produto C", 70.0)
    )

    val produtosOrdenados = produtos.sortedWith { p1, p2 -> p1.compareTo(p2) }
    println("\nProdutos ordenados por preço:")
    produtosOrdenados.forEach { println(it) }
}

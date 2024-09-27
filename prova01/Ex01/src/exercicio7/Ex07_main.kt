data class Pessoa(val nome: String, val idade: Int, val altura: Double)

fun main() {
    val pessoas = listOf(
        Pessoa("Ana", 25, 1.65),
        Pessoa("Carlos", 30, 1.80),
        Pessoa("Beatriz", 22, 1.70),
        Pessoa("Daniel", 30, 1.75),
        Pessoa("Eduardo", 28, 1.82)
    )

    val porAlturaDecrescente = pessoas.sortedByDescending { it.altura }
    println("Ordenado por altura em ordem decrescente:")
    porAlturaDecrescente.forEach { println("${it.nome}, ${it.idade} anos, ${it.altura} m") }

    val porIdadeCrescenteComAltura = pessoas.sortedWith(compareBy({ it.idade }, { it.altura }))
    println("\nOrdenado por idade em ordem crescente (altura como critério de desempate):")
    porIdadeCrescenteComAltura.forEach { println("${it.nome}, ${it.idade} anos, ${it.altura} m") }

    val porNomeAlfabetico = pessoas.sortedBy { it.nome }
    println("\nOrdenado por nome em ordem alfabética:")
    porNomeAlfabetico.forEach { println("${it.nome}, ${it.idade} anos, ${it.altura} m") }
}

package exercicio5

fun main() {
    val formas: List<FormaGeometrica> = listOf(
        Circulo(cor = "Azul", raio = 5.0),
        Retangulo(cor = "Vermelho", largura = 4.0, altura = 6.0),
        Circulo(cor = "Verde", raio = 3.0),
        Retangulo(cor = "Amarelo", largura = 2.0, altura = 8.0)
    )

    val areaTotal = formas.sumOf { it.calcularArea() }

    println("A área total de todas as formas é: $areaTotal")
}

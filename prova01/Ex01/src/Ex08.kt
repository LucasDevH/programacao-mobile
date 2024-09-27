import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun main() {
    println("Diretório atual: " + System.getProperty("user.dir"))
    val scanner = Scanner(System.`in`)
    var arquivoEncontrado = false

    while (!arquivoEncontrado) {
        try {
            print("Digite o nome do arquivo para leitura: ")
            val nomeArquivo = scanner.nextLine()

            val file = File(nomeArquivo)
            val conteudo = file.readText()

            println("Conteúdo do arquivo:")
            println(conteudo)

            arquivoEncontrado = true

        } catch (e: FileNotFoundException) {
            println("Arquivo não encontrado. Tente novamente.")
        }
    }
}

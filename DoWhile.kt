package fundamentos

fun main(args: Array<String>) {
    var opcao = 0

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    } while ( opcao != -1)

    println("Até já!")
}
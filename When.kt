package fundamentos

fun main(args: Array<String>) {

    val nota =11

    when(nota){
        9,10 -> println("Excelente!")
        7,8 -> println("Muito bom!")
        in 4..6 -> println("Fraco!")
        in 0..3 -> println("Não tem como passar")
        else -> println("Nota Inválida!")
    }

}
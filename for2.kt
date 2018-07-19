package fundamentos

fun main(args: Array<String>) {
    val alunos = arrayListOf("Andre","Diogo","Marcia")
    for ( (indice, aluno) in alunos.withIndex()){
        println("$indice - $aluno")
    }
}
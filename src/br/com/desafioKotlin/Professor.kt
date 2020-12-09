package br.com.desafioKotlin

abstract class Professor(
    val nomeProfessor: String,
    val sobrenomeProfessor: String,
    val tempoDeCasa: Int,
    val codigoProfessor: Int
) {

    override fun equals(other: Any?): Boolean {
        if (other is Professor) {
            return codigoProfessor == other.codigoProfessor
        }
        return false
    }
}
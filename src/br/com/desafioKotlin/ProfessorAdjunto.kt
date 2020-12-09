package br.com.desafioKotlin

class ProfessorAdjunto (
    nomeProfessor: String,
    sobrenoneProfessor: String,
    tempoDeCasa: Int,
    codigoProfessor: Int,
    val horasMonitoria: Int
) :
    Professor(nomeProfessor, sobrenoneProfessor, tempoDeCasa, codigoProfessor) {
}
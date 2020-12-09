package br.com.desafioKotlin

data class Curso(
    val nomeCurso: String,
    val codigoCurso: Int,
    val qtdMaxAlunos: Int,
    var professorTitular: ProfessorTitular? = null,
    var professorAdjunto: ProfessorAdjunto? = null
) {
    val alunosMatriculados = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        if (other is Curso) {
            return codigoCurso == other.codigoCurso
        }
        return false
    }

    fun adicionarAluno(aluno: Aluno): Boolean {
        if (alunosMatriculados.size < qtdMaxAlunos) {
            val add = alunosMatriculados.add(aluno)
            return true
        }
        return false
    }
}


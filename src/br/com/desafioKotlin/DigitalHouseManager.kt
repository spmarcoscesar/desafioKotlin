package br.com.desafioKotlin

class DigitalHouseManager {
    private val alunos = mutableListOf<Aluno>()
    private val professores = mutableListOf<Professor>()
    private val cursos = mutableListOf<Curso>()
    private val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nomeCurso: String, codigoCurso: Int, qtdMaxAlunos: Int) {
        val curso = Curso(nomeCurso, codigoCurso, qtdMaxAlunos)
    }

    fun excluirCurso(codigoCurso: Int) {
        for (curso in cursos) {
            if (curso.codigoCurso == codigoCurso)
                cursos.remove(curso)
        }
    }

    fun registrarProfessorAdjunto(
        nomeProfessor: String,
        sobrenomeProfessor: String,
        codigoProfessor: Int,
        qtdHoras: Int
    ) {
        val professorAdjunto = ProfessorAdjunto(
            nomeProfessor,
            sobrenomeProfessor,
            0,
            codigoProfessor,
            qtdHoras
        )
        val add = professores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(
        nomeProfessor: String, sobrenomeProfessor: String,
        codigoProfessor: Int,
        tempoDeCasa: Int,
        especialidade: String
    ) {
        val professorTitular =
            ProfessorTitular(nomeProfessor, sobrenomeProfessor, tempoDeCasa, codigoProfessor, especialidade)
        professores.add(professorTitular)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (prof in professores) if (prof.codigoProfessor == codigoProfessor) {
            professores.remove(prof)
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var alunoEncontrado: Aluno? = null
        var cursoEncontrado: Curso? = null
        for (aluno in alunos) if (aluno.codigoAluno == codigoAluno)


            for (curso in cursos) {
                if (curso.codigoCurso == codigoCurso) cursoEncontrado = curso
            }
        if (alunoEncontrado != null && cursoEncontrado != null) {
            val realizadoComSucesso = cursoEncontrado
            if (realizadoComSucesso) {
                val matricula = Matricula(alunoEncontrado, cursoEncontrado)
                matriculas.add(matricula)
            } else {
                println("Infelizmente não há mais vagas disponíveis neste curso.")
            }
        }

    }

    fun criarAluno(nomeAluno: String, sobrenomeAluno: String, codigoAluno: Int) {
        val aluno = Aluno(nomeAluno, sobrenomeAluno, codigoAluno)
    }

    fun alocarProfessores(
        codigoCurso: Int,
        codigoProfessorTitular: Int, codigoProfessorAdjunto:
        Int
    ) {
        var cursoEncontrado: Curso? = null
        var professorTitularEncontrado: ProfessorTitular? = null
        var professorAdjuntoEncontrado: ProfessorAdjunto? = null
        for (curso in cursos) {
            if (curso.codigoCurso == codigoCurso) {
                cursoEncontrado = curso
            }
        }
        for (prof in professores) {
            if (prof.codigoProfessor == codigoProfessorTitular && prof is ProfessorTitular) {
                professorTitularEncontrado = prof
            }
            if (prof.codigoProfessor == codigoProfessorAdjunto && prof is ProfessorAdjunto) {
                professorAdjuntoEncontrado = prof
            }
        }

        if (cursoEncontrado != null) {
            if (professorAdjuntoEncontrado != null) {
                cursoEncontrado.professorAdjunto = professorAdjuntoEncontrado
                println("Professor adjunto ${professorAdjuntoEncontrado.nomeProfessor} alocado no curso de ${cursoEncontrado.nomeCurso}")
            }
            if (professorTitularEncontrado != null) {
                cursoEncontrado.professorTitular = professorTitularEncontrado
                println("Professor titular ${professorTitularEncontrado.nomeProfessor} alocado no curso de ${cursoEncontrado.nomeCurso}")
            }
        }

    }
}

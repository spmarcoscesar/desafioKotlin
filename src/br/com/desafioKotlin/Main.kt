package br.com.desafioKotlin

fun main() {
    val manager = DigitalHouseManager()

    manager.criarAluno("Jorge", "BenJor", 1)
    manager.criarAluno("Renato", "Aragão", 2)
    manager.criarAluno("Elis", "Regina", 3)
    manager.criarAluno("Sandy", "Junior", 4)
    manager.criarAluno("Roberta ", "Miranda", 5)

    manager.registrarProfessorTitular("Tom", "Jobim", 1, 3, "Koltin")
    manager.registrarProfessorTitular("Camargo", "Guarnieri", 2, 2, "Java")

    manager.registrarProfessorAdjunto("Marcelo", "D2", 3, 12)
    manager.registrarProfessorAdjunto("ZÉ", "Cabaleiro", 4, 11)

    manager.registrarCurso("IOS", 202001, 3)
    manager.registrarCurso("Android", 202002, 2)

    manager.alocarProfessores(202001, 1, 3)
    manager.alocarProfessores(202002, 2, 4)

    manager.matricularAluno(1, 201)
    manager.matricularAluno(2, 201)
    manager.matricularAluno(3, 202)
    manager.matricularAluno(4, 202)
    manager.matricularAluno(5, 202)


}
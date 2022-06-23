package one.digitalinnovations.digionebank.testes

import one.digitalinnovations.digionebank.FunAnalista


fun main() {
    val funcAnalistaInfo = FunAnalista(nome = "Wilsom", cpf = "000.000.000-00", salario = 2000.00)
    // user10.cpf = "987.654.321.99"   //** -> Quando nao setado a classe privada (private / private set / private get [tudo/modifica/le] ) permite alterar dados em qualquer lugar do codigo <-
    println("-- funAnalistaInfo --")
    GeraRelatorioFuncionario.imprimeRelatorio(funcAnalistaInfo)
    println("---------------------")
}


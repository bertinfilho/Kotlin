package one.digitalinnovations.digionebank.testes

import one.digitalinnovations.digionebank.FunGerente


fun main() {
    val funcGerenteInfo = FunGerente(nome = "Bertin", cpf = "111.222.333-44", salario = 5000.00)
    println("-- funGerenteInfo --")
    GeraRelatorioFuncionario.imprimeRelatorio(funcGerenteInfo)
    println("---------------------")
}



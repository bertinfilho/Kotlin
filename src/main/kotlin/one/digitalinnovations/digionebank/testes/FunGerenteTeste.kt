package one.digitalinnovations.digionebank.testes

import one.digitalinnovations.digionebank.FunGerente


fun main() {
    val funcGerenteInfo = FunGerente("Bertin","111.222.333-44",5000.00,"Senha123")
    println("-- funGerenteInfo --")
    GeraRelatorioFuncionario.imprimeRelatorio(funcGerenteInfo)
    AcessoAutenticaTeste().autentica(funcGerenteInfo)
    println("---------------------")
}



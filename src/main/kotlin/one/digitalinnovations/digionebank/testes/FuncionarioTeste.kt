package one.digitalinnovations.digionebank.testes

import one.digitalinnovations.digionebank.Funcionario
import one.digitalinnovations.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val pessoaInfo = Pessoa(nome="Wilson", cpf = "987.654.321-00")
    // user10.cpf = "987.654.321.99"   //** -> Quando nao setado a classe privada (private / private set / private get [tudo/modifica/le] ) permite alterar dados em qualquer lugar do codigo <-
    println("----- Pessoa --------")
    println(pessoaInfo.nome)
    println(pessoaInfo.cpf)
    println("---------------------")
    println()

    val funcionarioInfo = Funcionario(pessoaInfo.nome, pessoaInfo.cpf, BigDecimal(2000.50))
    // user10.cpf = "987.654.321.99"   //** -> Quando nao setado a classe privada (private / private set / private get [tudo/modifica/le] ) permite alterar dados em qualquer lugar do codigo <-
    println("-- Funcionario --")
    println(funcionarioInfo.nome)
    println(funcionarioInfo.cpf)
    println("R$ ${funcionarioInfo.salario} ")
    println("---------------------")



}
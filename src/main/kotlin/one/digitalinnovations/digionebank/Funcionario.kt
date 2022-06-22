package one.digitalinnovations.digionebank
import java.math.BigDecimal

abstract class Funcionario(
    nome : String,
    cpf : String,
    val salario : BigDecimal

) : Pessoa(nome, cpf){

    //Criacao de funcao auxilio para salario
    abstract fun calculoAuxilio():

}
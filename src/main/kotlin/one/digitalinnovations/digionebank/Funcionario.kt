package one.digitalinnovations.digionebank

abstract class Funcionario(
    nome : String,
    cpf : String,
    val salario : Double,
) : Pessoa(nome, cpf){

    //Criacao de funcao auxilio para salario - pretecd somente classes filhas poden usar a funcao calculoAuxilio
    protected abstract fun calculoAuxilio():Double

    override fun toString():String = """
        Nome = $nome
        Cpf = $cpf
        Salario = R$ $salario
        Auxilio = R$ ${calculoAuxilio()}
    """.trimIndent()
    }
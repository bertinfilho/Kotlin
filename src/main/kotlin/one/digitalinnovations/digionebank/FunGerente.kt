package one.digitalinnovations.digionebank

class FunGerente(nome:String,
                 cpf:String,
                 salario:Double
) : Funcionario(nome= nome, cpf = cpf, salario= salario){
    override fun calculoAuxilio(): Double = salario *0.4
}
package one.digitalinnovations.digionebank

class FunGerente(nome:String,
                 cpf:String,
                 salario:Double,
                 var senha:String
) : Funcionario(nome= nome, cpf = cpf, salario= salario), AcessoAutentica {
    override fun calculoAuxilio(): Double = salario *0.4
    override fun validaAcesso(): Boolean = "Senha123" == senha
}
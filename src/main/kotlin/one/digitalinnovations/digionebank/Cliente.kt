package one.digitalinnovations.digionebank

class Cliente(nome:String,cpf:String,val clienteTipo: ClienteTipo, val senhaCliente:String):Pessoa(nome, cpf), AcessoAutentica {
    override fun validaAcesso(): Boolean  = "Nova2019" == senhaCliente

    override fun toString(): String = """
        Nome:   $nome
        CPF:    $cpf
        Tipo:   ${clienteTipo.descricao}
        """
        .trimIndent()
}
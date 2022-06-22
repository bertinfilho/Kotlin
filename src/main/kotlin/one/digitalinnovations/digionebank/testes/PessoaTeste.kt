package one.digitalinnovations.digionebank.testes
import one.digitalinnovations.digionebank.Pessoa

    fun main() {
        val user10 = Pessoa(nome="Bertin", cpf = "987.654.321-99")
        // user10.cpf = "987.654.321.99"   //** -> Quando nao setado a classe privada (private / private set / private get [tudo/modifica/le] ) permite alterar dados em qualquer lugar do codigo <-

        println(user10.nome)
        println(user10.cpf)



    }
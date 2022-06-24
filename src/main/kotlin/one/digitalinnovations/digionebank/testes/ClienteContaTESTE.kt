package one.digitalinnovations.digionebank.testes

import one.digitalinnovations.digionebank.Cliente
import one.digitalinnovations.digionebank.ClienteTipo

fun main(){
    val accCliente=Cliente(
        nome = "Toro Louco",
        cpf = "222.222.222-22",
        clienteTipo = ClienteTipo.PF,
        senhaCliente = "Nova2019"
    )
    println(accCliente)
    AcessoAutenticaTeste().autentica(accCliente)
}
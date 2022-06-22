package one.digitalinnovations.digeonebank

class pessoa {
    var xname : String = "Wilson"
    // private set ** -> Aplicado abaixo da var bloqueia so a var acima
    var cpf : String = "123.456.789.00"
    private set

}

fun main() {
    val user10 = pessoa()
    // user10.cpf = "987.654.321.99"   //** -> Quando nao setado a classe privada (private / private set / private get [tudo/modifica/le] ) permite alterar dados em qualquer lugar do codigo <-

    println(user10.xname)
    println(user10.cpf)

}
package one.digitalinnovations.digionebank.testes
import one.digitalinnovations.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nomeBanco = "DigiOne", numbBanco = 12)

    println(digiOneBank.nomeBanco)
    println(digiOneBank.numbBanco)

    val copiaBanco = digiOneBank.copy("banco2",10)
    println(copiaBanco.nomeBanco)
    println(copiaBanco.numbBanco)

}
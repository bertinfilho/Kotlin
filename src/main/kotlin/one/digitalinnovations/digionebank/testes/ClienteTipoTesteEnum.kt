package one.digitalinnovations.digionebank.testes
import one.digitalinnovations.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} -  $elemento") // Codigo executa Nx (Conforme quantidade de ENUM)
    }

    ClienteTipo.values().forEach {
        println("${it.name} -  ${it.descricao}")  // Codigo executa Nx (Conforme quantidade de ENUM)
    }

    ClienteTipo.values().forEach {
        println("$it -  $it")                    // Codigo executa Nx (Conforme quantidade de ENUM)
    }
    println("--------------------------")
// print elemento + descricao do clienteTipo

    val cpyPFemClienteTipo = ClienteTipo.PF
    println(" ${cpyPFemClienteTipo.name} -  ${cpyPFemClienteTipo.descricao} ") // Codigo executa ENUM apontado * PF

    val cpyPJemClienteTipo = ClienteTipo.PJ
    println(" ${cpyPJemClienteTipo.name} -  ${cpyPJemClienteTipo.descricao} ") // Codigo executa ENUM apontado * PJ

    val cpyPIemClienteTipo = ClienteTipo.PI
    println(" ${cpyPIemClienteTipo.name} -  ${cpyPIemClienteTipo.descricao} ") // Codigo executa ENUM apontado * PI

    println("----------- FIM ---------------")
}
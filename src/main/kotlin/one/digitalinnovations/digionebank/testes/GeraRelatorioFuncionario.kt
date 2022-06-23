package one.digitalinnovations.digionebank.testes

import one.digitalinnovations.digionebank.Funcionario

class GeraRelatorioFuncionario {
    companion object {
        fun imprimeRelatorio(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}
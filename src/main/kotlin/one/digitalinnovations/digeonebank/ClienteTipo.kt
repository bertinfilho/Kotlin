package one.digitalinnovations.digeonebank

enum class ClienteTipo(var descricao:String) {  // --->  ENUM 'ClienteTipo' e construtor primario (descricao:String)

    // Abaixo: OBJs de clienteTipo
    PF("Personal"),
    PI("Extrangeiro"),
    PJ("Enterprise")
}
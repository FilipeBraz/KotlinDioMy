package digionebank.testes

import digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val daniel = Cliente(
        nome = "Daniel Serrano",
                cpf = "123.123.123-55",
                clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(daniel)

    TesteAutenticacao().autentica(daniel)

}

package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main()
{
    val digiOneBank = Banco(numero = 15, nome = "DigiOne")
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    digiOneBank.nome = "Concorrente"
    println(digiOneBank.nome)
}
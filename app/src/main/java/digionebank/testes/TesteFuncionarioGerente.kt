package one.digitalinnovation.digionebank.testes
import digionebank.testes.TesteAutenticacao
import one.digitalinnovation.digionebank.Gerente


fun main(){
    val filipe = Gerente(nome = "Filipe Braz", cpf =  "549849841", salario =  5000.0, senha = "124")
    ImprimeRelatorioFuncionario.imprime(filipe)

    TesteAutenticacao().autentica(filipe)
}




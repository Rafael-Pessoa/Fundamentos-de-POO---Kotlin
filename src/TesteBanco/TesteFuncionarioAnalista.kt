package TesteBanco

import DigiOneBank.Analista
import DigiOneBank.Funcionario

fun main(){
    var joaoRoberto = Analista("João Roberto Dias","101.714.758-28",1200.0)

    imprimeRelatorio(joaoRoberto)

}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())

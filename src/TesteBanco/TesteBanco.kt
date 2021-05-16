package TesteBanco
import DigiOneBank.Banco


fun main(){

    var BancoDigital1 = Banco("Itau", 1667)
    println(BancoDigital1.nome)
    var contador= 1..10
    for(i in contador){
        println(BancoDigital1.numero)


    }


}
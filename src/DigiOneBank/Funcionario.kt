package DigiOneBank



abstract class Funcionario(nome: String, cpf: String, var salario: Double) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio():Double

    override fun toString(): String ="""
        Nome:$nome
        CPF:$cpf
        Salário:$salario
        Auxílio:${calculoAuxilio()}
    """.trimIndent()

}









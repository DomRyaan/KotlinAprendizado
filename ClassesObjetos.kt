package com.exemplo.aprendendokotlinzero


class Player (// Construtor primário
    // Propriedades de uma Classe
    var kart: String = "",
    var nickname: String = ""
)
{
    init {// Chamado assim que um objeto é criado
        println("Objeto inicializado")
        println("Nome: $nome" +
                "\nNickName: $nickname" +
                "\nKart: $kart")
    }

    // Construtor Secundario
    constructor(nickname: String): this(kart = "", nickname) // Chamando o construtor primário (Obrigatorio)
    {
        println("Construtor Secundario chamado")
    }

    fun getKart(){
        println(this.kart)
    }

    // Métodos de uma classe
    fun acelerar(){
        println("Acelerando")
    }

    fun usarPoder(): String = "Casco Vermelho"

    fun retornarAtributo(): String{
        return this.kart
    }

    // Polimofismo
        // Sobrecarga
            // Cada metodo tem uma assinatura, que é dada por nome + parametro + tipo
            fun playerJogando(nickname: String, senha: String)
            {
                println("O usuario $nickname entrou usando a senha: $senha")
            }

            fun playerJogando(telefone: String){
                println("O usuario entrou usando o telefone: $telefone")
            }

}


fun main() {

    val player = Player("Kart do Donkey Kong")

}
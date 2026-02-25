package com.exemplo.aprendendokotlinzero;

class Player(
    // Construtor primário
    // Propriedades de uma Classe
    var kart: String = ""
)
{
    lateinit var nickname: String
    // Modificadores de acesso
    public var panda = "Modificador publico, e o modificador padrão em Kotlin. Visivel em todo lugar. Ele é o modificador padrão do Kotlin"
    private var panda2 = "Torna visivel apenas dentro da classe"
    protected var panda3 = "Torna visivel apenas na classe e subClasses"
    internal var panda4 = "Visivel em todo lugar dentro de um módulo"

    init {// Chamado assim que um objeto é criado
        println("Objeto inicializado")
        println("Nome: $nome" +
                "\nNickName: $nickname" +
                "\nKart: $kart")
    }

    // Construtor Secundario
    /*
    constructor(nickname: String): this(kart = "", nickname) // Chamando o construtor primário (Obrigatorio)
    {
        println("Construtor Secundario chamado")
    }

     */

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
    player.nickname = "Moskei"

}
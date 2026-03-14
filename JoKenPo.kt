package com.exemplo.aprendendokotlinzero

// Model
class Mao(
    var gesto: Gesto,
    val ganha: List<Gesto>,
    val perde: List<Gesto>
){}

// M
enum class Gesto{
    PEDRA,
    PAPEL,
    TESOURA
}

// Controler
class JogoController{

    companion object{
        fun jogar(jogador1: Mao, jogador2: Mao): String
        {
          if (jogador1.ganha.contains(jogador2.gesto))  {
              return "Jogador 1 ganha do jogador 2.\nPois ${jogador1.gesto} ganha de ${jogador2.gesto}"
          }
          else if (jogador1.perde.contains(jogador2.gesto)){
              return "Jogador 1 perde do jogador 2.\nPois ${jogador1.gesto} perde de ${jogador2.gesto}"
          }

          return "Os dois empataram"
        }
    }
}


// Model
val pedraGanha = arrayListOf(Gesto.TESOURA)
val pedraPerde = arrayListOf(Gesto.PAPEL)

val PEDRA: Mao = Mao(Gesto.PEDRA, pedraGanha, pedraPerde)

val papelGanha = arrayListOf(Gesto.PEDRA)
val papelPerde = arrayListOf(Gesto.TESOURA)

val PAPEL: Mao = Mao(Gesto.PAPEL, papelGanha, papelPerde)

val tesouraGanha = arrayListOf(Gesto.PAPEL)
val tesouraPerde = arrayListOf(Gesto.PEDRA)

val TESOURA: Mao = Mao(Gesto.TESOURA, pedraGanha, pedraPerde)

// View
fun main() {
    val jogador1 = PAPEL
    val jogador2 = PAPEL

    val resultado = JogoController.jogar(jogador1, jogador2)
    println(resultado)
}
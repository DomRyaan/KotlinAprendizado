package com.exemplo.aprendendokotlinzero

class Mensagem(
    val msg: String,
    val duration: Int
) {

    fun mostrar() {
        println("Funcao mostrar mesangem encadeada")
        println("Mensagem: $msg - Duracao: $duration")
    }

    companion object {
        const val DURACAO_CURTA = 0
        const val DURACAO_LONGA = 1

        fun construirTexto(mensagem: String, duracao: Int): Mensagem {
            println("Funcao construir texto")
            return Mensagem(mensagem, duracao)
        }
    }
}

fun main() {

    Mensagem.construirTexto("Ola Mundo", Mensagem.DURACAO_LONGA).mostrar()
}
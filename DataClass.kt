package com.exemplo.aprendendokotlinzero

import java.util.LinkedList

data class Pergunta(val nome: String, val resposta: Int){}

fun main() {
    val pergunta1 = Pergunta("Qual a pergunta?", 1)
    val pergunta2 = Pergunta("Qual a pergunta?", 1)


    val (per, res) = pergunta1

    println(per)
    println(res)
}
package com.exemplo.aprendendokotlinzero

import java.util.zip.DeflaterOutputStream

class Matematica {

    // Função Normal
    fun soma2(a: Int,
              b: Int
    ): Int {
        return a + b
    }
}

fun soma1(a: Double, b: Double) = a + b // Inline Function

// Função como paramêtro
fun calcular(a: Int, b: Int, funcao: ((Int, Int) -> Int)? ){
    println(funcao?.let{
        it(a, b)
        })
}

class Caixa {
    fun processarPrecos(
        listaPreco: List<Double>,
        funcOperacao: (Double) -> Double
    ): List<Double> {
        return listaPreco.map { funcOperacao(it) }
    }
}

fun Int.dobrando(): Int{
    return this * 2
}

fun teste(funcao: suspend (String) -> String){

}

fun bbb(a: (Int) -> (Int) -> Int){

}

fun main() {
/*
    val funcaoLambida = { nome: String, idade: Int ->
        println("Executar $nome com $idade")
    }

    funcaoLambida("Ryan", 20)
 */

    val listaPreco = listOf(10.0, 5.0, 20.0)

    val caixa = Caixa()

    val num: Int = 2

    println(num.dobrando())

    val soma: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    
    var retorno = caixa.processarPrecos(listaPreco) { preco ->
        preco * 0.9
    }

}

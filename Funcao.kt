package com.exemplo.aprendendokotlinzero

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
fun calcular(funcao: (Int, Int) -> Int) {
    println(funcao(10, 10))
}

fun main() {

    val mat = Matematica()

    calcular( mat::soma2)
}
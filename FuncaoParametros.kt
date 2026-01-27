package com.exemplo.aprendendokotlinzero

fun multi(numer1: Int, numer2: Int){
    println(numer1 * numer2)
}

// Parametro com valor default/padrão
fun somaComPi(numero: Double, pi: Double = 3.14){
    println(numero + pi)
}

fun main() {
    somaComPi(5.0, 3.145)
}
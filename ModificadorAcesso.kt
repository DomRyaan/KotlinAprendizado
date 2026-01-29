package com.exemplo.aprendendokotlinzero

// Modificadores de acesso
/*
public = "Modificador publico, e o modificador padrão em Kotlin. Visivel em todo lugar. Ele é o modificador padrão do Kotlin"
private = "Torna visivel apenas dentro da classe"
protected = "Torna visivel apenas na classe e subClasses"
internal = "Visivel em todo lugar dentro de um módulo"
*/

abstract class Marca {
    protected val nome = "Ford"
    private val dono = "Jhon Fantastico"
    private var lucroHoje = 2000

    protected fun logo(): String{
        return "Carro Ford!"
    }
}

class Carro : Marca()
{
    var marca = ""

    init {
        this.marca = super.nome
    }

    protected fun lucro(){
        println("2.000 R$")
    }

    fun acelerar(){
        println("Acelerar o ${super.logo()}")
    }
}

fun main() {
    val carro1: Carro = Carro()
    carro1.acelerar()
}
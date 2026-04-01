package com.exemplo.aprendendokotlinzero.colecoes

class Usuario() {
    var nome: String = ""
        get() {
            println("Chamando o getter no Kotlin")
            return field
        }
        set(value){
            println("Chamando o setter no Kotlin")
            field = value
        }
    var idade: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var maiorIdade = false
        get() = idade >= 18
}

fun main() {
    val usuario = Usuario()

    usuario.nome = "Ryan"
    usuario.idade = 20

    println(usuario.idade)
    println(usuario.maiorIdade)
}
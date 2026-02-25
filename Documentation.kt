package com.exemplo.aprendendokotlinzero

import org.jetbrains.annotations.TestOnly

/*
object Cozinheiro{
    var nome = "Ryan"
    private val cpf = "09071132307"

    fun fazerComida(){
        println("O $nome esta fazendo a comida")
    }
}
*/

// Coding Conventions

// To Class and Object Upper Camel Case
class Usuario(
    user: String,
    age: Int
){
   //  1. Propriedades e Construtores Primarios e Inicializacao
    lateinit var user: String
    var age: Int = 0

    init {
        this.user = user
        this.age = age
    }
/*
    2. Construtores Secundario
    3. Metodos
    4. Companion Object

*/
}

val USER_NAME = "Ryan"
const val CHAVE = "CHAVE_EXTRA"

fun main() {

}
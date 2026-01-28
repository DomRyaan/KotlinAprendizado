package com.exemplo.aprendendokotlinzero

// Revisada POO: Classe abstratas não podem ser concretizada, servindo apenas de modelos para classes concretas
abstract class Animal{
    var cor = ""
    var tamanho = 0.0
    var peso = 0.0

    // Polimorfismo
        // Sobreposição
            // Por padrão as classes/metodos em Kotlin são "final", ou seja, não podem ser modificadas
            // Então, caso queira utilizar Herança, crie uma classe/metodo aberta, atraves da palavra chave "open"
             open fun correr(){
                print("Correndo como um ")
            }
    // Métodos também pode ser abstrato
    // Obrigando a classe filho implementar ela
    abstract fun dormir()
}

// Uma classe concreta
class Cao : Animal() {
    override fun correr() {
        super.correr()
        print("cao de 4 patas")
    }

    override fun dormir() {
        println("Dormir no chão")
    }

    fun latir(){
        println("\nAU AU!!")
    }
}

class Passaro : Animal() {
    // Polimosfismo
    //Função de sobreposição
    override fun correr() {
        super.correr()
        print("passaro de 2 patas")
    }


    override fun dormir() {
        println("Dormir na arvore")
    }

    fun voar(){
        println("\nVoando")
    }
}

fun main() {

    val cao = Cao()
    val passaro = Passaro()
    

    cao.cor = "Preto"
    passaro.cor = "Azul"

    cao.correr()
    cao.latir()

    passaro.correr()
    passaro.voar()
}
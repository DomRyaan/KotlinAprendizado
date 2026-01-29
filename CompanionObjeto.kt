package com.exemplo.aprendendokotlinzero

class Automovel(
    var modelo: String = "",
    var velocidade: Int = 0
){
    var funcionando = false

    fun getInformacao(){
        println("Informacoes: ${this.modelo}, ${this.velocidade}")
    }

    init {
        this.funcionando = true
    }

    companion object leis {
        const val VELOCIDADE_MAXIMA_PERMITIDA = 280



        fun issoFunciona(carro: Automovel){
            if (carro.funcionando){
                println("Esse carro esta funcionando")
            }else{
                println("Esse carro nao esta funcionando")
            }
        }
    }
}

fun main() {
    val fusca = Automovel("Fusca", 10);
    fusca.getInformacao()

    val ferrari = Automovel("Ferrari", 100);
    ferrari.getInformacao()

    println("Velocidade maxima permitida: ${Automovel.leis.VELOCIDADE_MAXIMA_PERMITIDA}")
    Automovel.issoFunciona(ferrari)
}
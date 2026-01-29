package com.exemplo.aprendendokotlinzero

interface Presidenciavel{
    fun candidatar()
}

 abstract class Pessoa{
     fun comer() = println("Comendo")
 }

class DesenvolvedorAndroid : Pessoa(), Presidenciavel{
    fun programar() = println("Programando")

    override fun candidatar() {
        println("Dev Android se candidatando-se")
    }
}
class DesenvolvedorWeb : Pessoa(){
    fun programar() = println("Programando")
}
class ServidorPublico : Pessoa(), Presidenciavel {
    var work = true

    protected fun exitWork(){
        println("Saindo do Emprego")
        this.work = false
    }

    override fun candidatar() {
        if (work){
        exitWork()
        }
        println("Se candidatando-se")
    }
}
class Jornalistaa : Pessoa(){
    fun escrevendo() = println("Escrevendo")
}

fun main() {
    val desenvolvedorAndroid = DesenvolvedorAndroid()
    val servidorPublico = ServidorPublico()

    servidorPublico.candidatar()
    desenvolvedorAndroid.candidatar()
}
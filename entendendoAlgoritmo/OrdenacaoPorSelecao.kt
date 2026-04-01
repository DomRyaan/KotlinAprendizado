package com.exemplo.aprendendokotlinzero.entendendoAlgoritmo

import android.R
import java.util.ArrayList

fun buscarMenor(array: List<Int>): Int{
    var menor = array[0]
    var menorIndice = 0

    for (i in array.indices) {
        if (array[i] < menor) {
            menor = array[i]
            menorIndice = i
        }
    }

    return menorIndice
}

fun buscarMaisOuvido(listaDeArtista: List<Artista>): Int {
    var ouvintes = listaDeArtista[0].ouvintes
    var indiceMaior = 0

    for (i in listaDeArtista.indices) {
        if (listaDeArtista[i].ouvintes > ouvintes) {
            ouvintes = listaDeArtista[i].ouvintes
            indiceMaior = i
        }
    }

    return indiceMaior
}


fun ordenacaoPorSelecao(array: List<Int>): ArrayList<Int>{
    val novaLista = arrayListOf<Int>()

    val array = array.toMutableList()

    for (i in array.indices) {
        var maior = buscarMenor(array)
        novaLista.add(array.removeAt(maior))
    }

    return novaLista
}

fun ordernarArtistas(listaDeArtista: List<Artista>): ArrayList<Artista> {
    val novaLista = arrayListOf<Artista>()

    val listaMultavel = listaDeArtista.toMutableList()

    for (i in listaDeArtista.indices) {
        var maior = buscarMaisOuvido(listaMultavel)
        novaLista.add(listaMultavel.removeAt(maior))
    }

    return novaLista
}

data class Artista(
    val nome: String,
    val ouvintes: Int
)

fun main() {
    val listaArtista = listOf<Artista>(
        Artista("RadioHead", 156),
        Artista("Kishore Kummar", 141),
        Artista("The Black Keys", 35),
        Artista("Neutral Milk Hotel", 95),
        Artista("Beck", 88),
        Artista("The Strokes", 61),
        Artista("Wilco", 111)
    )

    println("Lista Desordenada: ")
    println(" Artista   |    Ouvintes")
    for (i in listaArtista) {
        println("${i.nome}  | ${i.ouvintes}")
    }

    val list = ordernarArtistas(listaArtista)

    println("\nLista Ordenada: ")
    println(" Artista   |    Ouvintes")
    for (i in list) {
        println("${i.nome}  | ${i.ouvintes}")
    }
}
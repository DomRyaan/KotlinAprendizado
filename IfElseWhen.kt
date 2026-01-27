package com.exemplo.aprendendokotlinzero

fun main() {
/*
    val nota1 = 6.0f
    val nota2 = 5.0f
    val nota3 = 7.0f
    val nota4 = 3.0f

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    val condicao = media >= 6

    val opcao = 5
    if (opcao in 1..3)
    {
        println("Numero entre 1 e 3")
    } else if (opcao in 4..6) {
        println("Numero entre 4 e 6")
    } else{
        print("Nenhuma das anteriores")
    }
    */

    // O wen do Kotlin é como se fosse o Switch do Java e outras linguagens

/*
    val opcao = 2


    when (opcao)
    {
        1 -> print("Opcao 1")
        2 -> print("Opcao 2")
        in 3..5 -> println("Opcao entre 3 e 5")
        else -> print("Nenhuma das anteriores")
    }
    */

    var nome = "Ryan"

    if ("a" in nome){
        print("A letra a esta no nome")
    } else
    {
        print("Não tem essa letra no nome")
    }
}
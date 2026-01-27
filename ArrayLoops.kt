package com.exemplo.aprendendokotlinzero

fun main(){
    val lista = arrayListOf(
        "Mamaco", "Monkey", "Macaco"
    )
/*
    var number = 1
    while (number <= 5)
    {
        println("Number $number")
        number++;
    }
*/
    for (item in lista)
    {
        println("Number: $item")
    }

}
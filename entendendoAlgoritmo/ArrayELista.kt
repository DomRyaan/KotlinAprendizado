package com.exemplo.aprendendokotlinzero.entendendoAlgoritmo


data class No<T>(var valor: T, var proximoValor: No<T>? = null)
data class ItemComprado(var localComprado: String, var gastou: Double)

open class CustomLinkedList<T> {
    protected var head: No<T>? = null
    protected var tail: No<T>? = null

     open fun add(valor: T) {
        val proximoNo = No(valor)

        if (head == null) {
            head = proximoNo
            tail = head
            return
        }

        tail?.proximoValor = proximoNo
        tail = proximoNo
    }

    fun insertAt(index: Int, item: T) {

        var corrente = head
        var i = 0
        while (corrente != null && i < index -1) {
            corrente = corrente.proximoValor
            i++
        }

        if (corrente == null) {
            throw IndexOutOfBoundsException("Indice invalido")
        }

        val novoNo = No(item)
        novoNo.proximoValor = corrente.proximoValor
        corrente.proximoValor = novoNo

        if (novoNo.proximoValor == null) {
            tail = novoNo
        }
    }

    protected fun addHead(valor: T){
        if (head == null) {
            head = No(valor)
            return
        }

        val headAtual = No(valor)
        headAtual.proximoValor = head

        head = headAtual
    }

    open fun printList() {
        var corrente = head

        while (corrente != null) {
            val exibicao = if (corrente.proximoValor != null) "${corrente?.valor} -> " else "${corrente?.valor}"
            print(exibicao)

            corrente = corrente?.proximoValor
        }
    }
}

class Compras : CustomLinkedList<ItemComprado>() {

     fun addLista(gastou: Double, localComprado: String) {
        val valor = ItemComprado(localComprado, gastou)
        super.add(valor)
    }

    private fun verificarGasto(): Double {
        var corrente = head

        if (corrente == null) return 0.0

        var totalGasto = 0.0
        while (corrente != null) {
            totalGasto += corrente.valor.gastou
            corrente = corrente.proximoValor
        }

        return totalGasto
    }

    private fun verificarLocaisDaCompra(): List<String>? {
        var corrente = head

        if(corrente == null) return null

        val mercados = arrayListOf<String>()


        while (corrente != null) {

            val lugarDaCompra = corrente.valor.localComprado
            mercados.add(lugarDaCompra)
            corrente = corrente.proximoValor
        }

        return mercados
    }

    override fun printList() {
        val gastos = verificarGasto()
        val localDaCompra = verificarLocaisDaCompra()

        if (localDaCompra == null || gastos == 0.0) {
            println("\t- Lista Vazia")
            return
        }

        var indice = 0
        for (i in localDaCompra) {
            ++indice
            println("\t$indice. ${i}")
        }

        println("\t     Total Gasto: $gastos")
    }
}

fun main() {
    /*
    val listaCompra = Compras()
    println("----- Aplicativo de Compras -----")
    while (true) {
           println("Selecione a opcao desejada:\n" +
                   "\t1 - Adicionar item a Lista\n" +
                    "\t2 - Ver Lista")
           var resposta = readln()

        when (resposta) {
            "1" -> {
                println("Onde comprou? ")
                val local = readln()
                println("Quanto gastou?")
                val gasto = readln().toDouble()

                listaCompra.addLista(gasto, local)
            }
            "2" -> {
                listaCompra.printList()
            }
            else ->{
                println("Opcao invalida")
                break
            }
        }
    }*/

    val linke = CustomLinkedList<Int>()


    linke.add(0)
    linke.add(1)
    linke.add(2)
    linke.add(3)
    linke.add(4)
    linke.add(6)

    linke.insertAt(5, 5)

    linke.printList()
}
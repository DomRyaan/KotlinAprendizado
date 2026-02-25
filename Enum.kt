package com.exemplo.aprendendokotlinzero

enum class StatusPedido{
    PEDIDO_REALIZADO,
    AGUARDANDO_APROVACAO,
    PEDIDO_ENVIADO
}

class Pedido(
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
){

}

fun main(){
    val pedido = Pedido(125.90, "camiseta, livro", StatusPedido.PEDIDO_REALIZADO)

    if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO){
        println("O pedido ja foi enviado")
    } else{
        println("Nothing")
    }
}
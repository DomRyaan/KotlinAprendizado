package com.exemplo.aprendendokotlinzero

import kotlinx.coroutines.*

data class Arvore (
    val node: Int,
){
    var leftNode: Arvore? = null
    var rightNode: Arvore? = null

    fun addArvore(root: Arvore?, item: Int): Arvore {
        if (root == null) return Arvore(item)

        if (item < root.node) {
            root.leftNode = addArvore(root.leftNode, item)
        } else {
            root.rightNode = addArvore(root.rightNode, item)
        }

        return root
    }


    companion object {
        fun exibirArvore(node: Arvore?) {
            if (node == null) {
                return
            }
            print(" " + node.node)

            exibirArvore(node.leftNode)
            exibirArvore(node.rightNode)
        }
    }

}

suspend fun inverterArvore(node: Arvore?): Arvore?{
    if (node == null) return null

    val temp = node.leftNode
    node.leftNode = node.rightNode
    node.rightNode = temp

    inverterArvore(node.leftNode)
    inverterArvore(node.rightNode)

    return node
}

fun main() {

    val escopo = CoroutineScope(Dispatchers.Default + Job())

    val root = Arvore(5)

    root.addArvore(root, 6)
    root.addArvore(root, 7)
    root.addArvore(root, 20)
    root.addArvore(root, 14)
    root.addArvore(root, 10)



    escopo.launch {
       println(inverterArvore(root))
    }


    escopo.launch {
        delay(6000)
        Arvore.exibirArvore(root)
    }

}
package com.exemplo.aprendendokotlinzero

import com.exemplo.aprendendokotlinzero.entendendoAlgoritmo.JavaTeste

class ExemploVargs{
    fun salvarTelefone(vararg telefones: String){
        for (telefone in telefones) {
            println("Telefone: ${telefone}")
        }
    }
}

fun main() {
    val javaTeste = JavaTeste()
    val ex = ExemploVargs()

    ex.salvarTelefone("85 98897923", "85 9889732345", "85 984234923")
}
package com.exemplo.aprendendokotlinzero

class Motorista(val nome2: String) {
    fun exibirDadosMotorista() = println("Caminhoneiro: $nome2")

    inner class Caminhao(val nomeCaminhao: String) { // Classe aninhada (Nested Class)
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao, Motorista: ${nome2}")
    }
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    /* SOLUTION BRUTE FORCE
    for (pon1 in nums.indices){
        println("Ponteiro 1: $pon1")
        for (pon2 in (pon1 + 1)..(nums.size - 1)){
            println("Ponteiro 2: $pon2")

            println("\nValor do Ponteiro 1: ${nums[pon1]}, Valor do Ponteiro 2: ${nums[pon2]}. Soma dos valores: ${nums[pon1] + nums[pon2]}")
            if (nums[pon2] + nums[pon1] == target) {
                return intArrayOf(pon1, pon2)
            }
        }
    }
     */
    val tableHash = hashMapOf<Int, Int>()

    for ((indice, value) in nums.withIndex()) {
        if (tableHash.get(value) != null) {
            return intArrayOf(tableHash.get(value) as Int, indice)
        }

        val valorFaltante = target - value
        tableHash[valorFaltante] = indice
    }
    return intArrayOf()
}

fun main() {
    val num = intArrayOf(1, 2, 3, 4, 6)

    val array = twoSum(num, 8)
/*
        // Criando um HashMap que mapeia Nomes (String) para Idades (Int)
        val idades = hashMapOf<String, Int>()

    val endereco = hashMapOf<Int, Int>()

    endereco[1] = 25
    endereco[-2] = 20
    */
    for (i in array){
        println(i)
    }
}
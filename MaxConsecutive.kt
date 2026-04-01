fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var maximo = 0
    var contador = 0

    for (i in nums.indices) {
        if (nums[i] == 1) contador++
        else {
            maximo = if (contador > maximo) contador else maximo
            contador = 0
        }
    }

    if (contador > maximo) return contador

    return maximo
}

fun main() {
    val list = intArrayOf(
        1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1
    )

    val listV = intArrayOf()

    print(findMaxConsecutiveOnes(list))
}
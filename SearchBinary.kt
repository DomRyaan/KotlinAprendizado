package com.exemplo.aprendendokotlinzero

import kotlin.math.floor
import kotlin.math.roundToInt
/*
inline fun media(up: Int, dowm: Int): Int{
    val media: Double = ( ).toDouble()

    return floor(media).toInt()
}
*/


fun searchBinary(numChoose: Int, array: List<Int>): Int?{
    var dowm = 0
    var up = array.size - 1
    while (dowm <= up) {
        var mid = (up + dowm) / 2
        var shoot = array[mid.toInt()]

        if (shoot == numChoose) {
            return mid
        } else if (shoot > numChoose) {
            up = mid - 1
        } else {
            dowm = mid + 1
        }
    }
    return null
}


fun main(){
    val array: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25)

    val numChoose = 7

    println(searchBinary(numChoose, array))
}
package com.exemplo.aprendendokotlinzero


import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.util.Locale
import java.time.format.DateTimeFormatter

enum class Dias{
            DOMINGO,
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO
}

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val data = LocalDate.now()
    val localizar = Locale("pt", "BR")

    val fomatador = DateTimeFormatter.ofPattern("E", localizar)

    val horario = "A COLETA DE HOJE VAI SER APARTIR DAS 19:45 DE SEG A SEX"

    val regexNãoDigito = """\D""".toRegex()

    val apenasNumero = regexNãoDigito.replace(horario,"")


    val hora = apenasNumero.substring(0, 2).toIntOrNull() ?: 18

    val minuto = if (apenasNumero.length >= 4) apenasNumero.substring(2, 4).toIntOrNull() ?: 0 else 0
    println(minuto)
}
import java.text.*
import java.util.*
import kotlin.io.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val utc = TimeZone.getTimeZone("UTC")
    val inputFormat: DateFormat = SimpleDateFormat(
        "hh:mm:ssaa",
        Locale.ENGLISH
    )
    inputFormat.timeZone = utc
    val outputFormat: DateFormat = SimpleDateFormat(
        "HH:mm:ss",
        Locale.ENGLISH
    )
    outputFormat.timeZone = utc
    val dateInput = inputFormat.parse(s)
    return outputFormat.format(dateInput)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
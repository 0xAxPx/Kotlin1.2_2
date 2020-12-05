import java.lang.StringBuilder
import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Введите количество человек кому понравилось:")
    val likes = scanner.nextInt()
    val result = StringBuilder()
        .append(likes)
        .append(" ")
        .append(likesPostFix(likes))
    println("Понравилось $result")
}

fun likesPostFix(likes : Int): String {
    return if (likes % 2 == 0) {
        return "людям"
    } else {
        return "человеку"
    }
}
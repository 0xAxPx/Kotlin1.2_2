import java.lang.StringBuilder
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    println("Количество LIKE:")
    val likes = scanner.nextInt()
    val result = StringBuilder()
        .append(likes)
        .append(" ")
        .append(likesPostFix(likes))
    println("Понравилось $result")
}

fun likesPostFix(likes : Int): String {
    return if (likes % 2 == 0 || likes.toString().endsWith("1")) {
        return "людям"
    } else {
        return "человеку"
    }
}

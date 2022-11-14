fun main() {
    val text = StringBuilder().apply {
        for (letter in 'A'..'Z') {
            append(letter)
        }
    }.toString()
    println(text)
}
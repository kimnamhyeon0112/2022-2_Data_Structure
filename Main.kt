fun main() {
    val stringBuilder = StringBuilder()
    val text = with(stringBuilder) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        toString()
    }
    println(text)
}
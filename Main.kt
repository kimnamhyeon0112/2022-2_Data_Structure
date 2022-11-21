import java.util.Stack

fun main() {
    while (true) {
        val line: String = readLine() ?: break
        if (line.isEmpty()) break
        val st = Stack<Char>()
        var previousChar: Char? = null
        var totalSlice = 0
        line.forEach {
            if (it == ')') {
                totalSlice += if (previousChar == '(') {
                    st.pop()
                    st.size
                } else {
                    st.pop()
                    1
                }
            }
            else st.push(it)
            previousChar = it
        }
        println(totalSlice)
    }
}
fun String.checkParentheses(): Boolean {
    val stack = Stack<Char>()
    for (character in this) {
        when (character) {
            '(' -> stack.push(character)
            ')' -> if (stack.isEmpty)
                return false
            else
                stack.pop()
        }
    }
    return stack.isEmpty
}

fun main()
{
    val s = "h((e))llo(world)()"
    println(s.checkParentheses())
    println("(hello world".checkParentheses())
}
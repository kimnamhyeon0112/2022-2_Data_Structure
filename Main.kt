import kotlin.collections.ArrayDeque
fun main() {
    val arDeque = ArrayDeque<Int>()
    arDeque.add(1)
    arDeque.add(2)
    arDeque.addLast(5)
    arDeque.addFirst(10)

    println(arDeque)
    arDeque.removeLast()
    println(arDeque)
}
fun main()
{
    val list = LinkedList<Int>()
    list.append(10).append(30).append(20)
    println("Before removing last node: $list")
    val removedValue = list.removeLast()
    println("After removing last node: $list")
    println("Removed value: $removedValue")
}
fun main()
{
    val list = LinkedList<Int>()
    list.append(10).append(30).append(20)
    println("Before removing at particular index: $list")
    val index = 1
    val node = list.nodeAt(index - 1)!!
    val removedValue = list.removeAfter(node)
    println("After removing at index: $index: $list")
    println("Removed value: $removedValue")
}
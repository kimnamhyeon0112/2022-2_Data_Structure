fun main()
{
    val list = LinkedList<Int>()
    list.append(3)
    list.append(2)
    list.append(1)
    list.append(4)
    list.append(5)

    println("Original: $list")
    println("Reversed: ${list.reversed()}")
}
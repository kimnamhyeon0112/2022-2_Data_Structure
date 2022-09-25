fun main()
{
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    var list2 = LinkedList<Int>()
    list2.append(2).append(3)
    println(list.containsAll(list2))
}
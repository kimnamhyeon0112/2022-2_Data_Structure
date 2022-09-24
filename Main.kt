fun main()
{
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)
    println(list)
    var the_node = list.nodeAt(0)!!
    while(true)
    {
        print("${the_node.value * 2}")
        if(the_node.next != null)
        {
            print(" -> ")
            the_node = the_node.next!!
        }
        else break
    }
}
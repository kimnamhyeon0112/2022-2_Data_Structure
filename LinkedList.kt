class LinkedList<T>
{
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0
    fun isEmpty(): Boolean{
            return size == 0
    }

    override fun toString(): String {
        if (isEmpty()) {
            return "Empty List"
        }
        return head.toString()
    }

    fun push(value: T): LinkedList<T>
    {
        head = Node(value = value, next = head)
        if (tail == null)
            tail = head
        size++
        return this
    }

    fun append(value: T)
    {
        if (isEmpty())
        {
            push(value)
            return
        }
        tail?.next = Node(value = value)
        tail = tail?.next
        size++
    }
}
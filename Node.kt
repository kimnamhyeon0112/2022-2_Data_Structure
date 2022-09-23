data class Node<T>(var value: T, var next: Node<T>? = null) //tail node가 null일 수 있으므로 ?가 붙는다
{
    override fun toString(): String
    {
        return if (next != null)
        {
            "$value -> ${next.toString()}"
        }
        else
        {
            "$value"
        }
    }
}
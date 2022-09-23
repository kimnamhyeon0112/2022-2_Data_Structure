class Box2<T>
{
    var content: T? = null
    fun put(content: T?)
    {
        this.content = content
    }
    fun retrieve(): T?
    {
        return content
    }
    fun isEmpty(): Boolean
    {
        return content == null
    }
}

fun main()
{
    val box = Box2<Int>()
    box.put(4)
    val boolBox = Box2<Boolean>()
    boolBox.put(true)
    boolBox.isEmpty()
}
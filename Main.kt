fun makeAVLTree(): AVLNode<Int> {
    val one = AVLNode(1)
    val seven = AVLNode(7)
    val eight = AVLNode(8)
    val nine = AVLNode(9)
    val eleven = AVLNode(11)
    val ten = AVLNode(10)
    val fifteen = AVLNode(15)
    seven.leftChild = one
    seven.rightChild = nine
    nine.leftChild = eight
    nine.rightChild = eleven
    eleven.leftChild = ten
    eleven.rightChild = fifteen
    return seven
}

fun main()
{
    var tree = makeAVLTree()
    println(tree)
    println("height: ${tree.height()}")
}
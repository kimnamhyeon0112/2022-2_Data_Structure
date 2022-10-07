fun makeBinaryTree(): BinaryNode<Int> {
    val zero = BinaryNode(0)
    val one = BinaryNode(1)
    val five = BinaryNode(5)
    val seven = BinaryNode(7)
    val eight = BinaryNode(8)
    val nine = BinaryNode(9)
    seven.leftChild = one
    one.leftChild = zero
    one.rightChild = five
    seven.rightChild = nine
    nine.leftChild = eight
    val tree = seven
    return tree
}

fun main()
{
    val exampleTree = BinarySerachTree<Int>().apply {
        insert(3); insert(1); insert(4)
        insert(0); insert(2); insert(5)
    }
    if (exampleTree.contains(5))
        println("Found 5!")
    else
        println("Couldn't find 5")
}
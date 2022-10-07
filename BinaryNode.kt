class BinaryNode<T>(var value: T) {
    var leftChild: BinaryNode<T>? = null
    var rightChild: BinaryNode<T>? = null

    private fun diagram(node: BinaryNode<T>?,
                        top: String = "",
                        root: String = "",
                        bottom: String = ""): String {
        return node?.let {
            if (node.leftChild == null && node.rightChild == null) {
                "$root${node.value}\n"
            } else {
                diagram(node.rightChild, "$top ", "$top┌──", "$top│ ") +
                        root + "${node.value}\n" +
                        diagram(node.leftChild, "$bottom│ ", "$bottom└──", "$bottom ")
            }
        } ?: "${root}null\n"
    }
    override fun toString() = diagram(this)

    fun traverseInOrder(visit: BinaryVisitor<T>){
        leftChild?.traverseInOrder(visit)
        visit(value)
        rightChild?.traverseInOrder(visit)
    }

    fun traversePreOrder(visit: BinaryVisitor<T>){
        visit(value)
        leftChild?.traversePreOrder(visit)
        rightChild?.traversePreOrder(visit)
    }

    fun traversePostOrder(visit: BinaryVisitor<T>){
        leftChild?.traversePostOrder(visit)
        rightChild?.traversePostOrder(visit)
        visit(value)
    }

    fun height(node: BinaryNode<T>? = this): Int {
        return node?.let {
            1 + max(height(node.leftChild), height(node.rightChild))
        } ?: -1
    }

    val min: BinaryNode<T>?
        get() = leftChild?.min ?: this

}
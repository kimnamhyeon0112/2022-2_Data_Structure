class BinarySerachTree<T: Comparable<T>>() {
    var root: BinaryNode<T>? = null
    override fun toString() = root?.toString() ?: "Empty tree"

    private fun insert(
        node: BinaryNode<T>?,
        value: T
    ): BinaryNode<T> {
        node ?: return BinaryNode(value)
        if (value < node.value)
            node.leftChild = insert(node.leftChild, value)
        else
            node.rightChild = insert(node.rightChild, value)
        return node
    }

    fun insert(value: T) {
        root = insert(root, value)
    }

    fun contains(value: T): Boolean {
        var current = root
        while (current != null) {
            if (current.value == value)
                return true
            current = if (value < current.value) {
                current.leftChild
            } else {
                current.rightChild
            }
        }
        return false
    }
}
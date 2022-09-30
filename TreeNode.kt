class TreeNode<T> (val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) = children.add(child)

    fun forEachDepthFirst(visit: Visitor<T>) {
        visit(this)     //println(visit.value)와 동일, 14번 줄의 typealias때문에 visit(this)로 출력가능
        children.forEach {
            it.forEachDepthFirst(visit)
        }
    }
}

typealias Visitor<T> = (TreeNode<T>) -> Unit
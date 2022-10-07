fun main()
{
    val tree = AVLTree<Int>()
    (0..14).forEach{
        tree.insert(it)
    }
    print(tree)
}
fun makeBeverageTree(): TreeNode<String> {
    val tree = TreeNode("Beverage")
    val hot = TreeNode("hot")
    val cold = TreeNode("cold")
    val tea = TreeNode("tea")
    val coffee = TreeNode("coffee")
    val chocolate = TreeNode("cocoa")
    val blackTea = TreeNode("black")
    val greenTea = TreeNode("green")
    val chaiTea = TreeNode("chai")
    val soda = TreeNode("soda")
    val milk = TreeNode("milk")
    val gingerAle = TreeNode("ginger ale")
    val bitterLemon = TreeNode("bitter lemon")

    tree.add(hot)
    tree.add(cold)
    tree.add(tea)
    tree.add(coffee)
    tree.add(chocolate)
    tree.add(soda)
    tree.add(milk)
    tree.add(blackTea)
    tree.add(greenTea)
    tree.add(chaiTea)
    tree.add(gingerAle)
    tree.add(bitterLemon)
    return tree
}

fun main() {
    val tree = makeBeverageTree()
    tree.forEachDepthFirst { println(it.value) }
}
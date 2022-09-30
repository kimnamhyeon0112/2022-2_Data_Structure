fun main(){
    val hot = TreeNode("Hot")
    val cold = TreeNode("Cold")
    val beverage = TreeNode("Beverages").run{
        add(hot)
        add(cold)
    }
}
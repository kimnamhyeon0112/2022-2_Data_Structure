fun main() {
    val trie = Trie<Char>().apply {
        insert("car")
        insert("card")
        insert("care")
        insert("cared")
        insert("car")
    }
    println(trie.lists)
    println(trie.count)
    println(trie.isEmpty)
}
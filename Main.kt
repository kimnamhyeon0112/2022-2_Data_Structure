fun main() {
    val trie = Trie<Char>()
    trie.insert("cute".toList())
    if (trie.contains("cute".toList())) {
        println("cute is in the trie")
    }
}
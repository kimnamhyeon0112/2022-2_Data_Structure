fun main() {
    val trie = Trie<Char>()
    trie.insert("cute")
    if (trie.contains("cute")) {
        println("cute is in the trie")
    }
}
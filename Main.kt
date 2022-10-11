fun main() {
    val trie = Trie<Char>()
    trie.insert("cut")
    trie.insert("cute")
    println("\n*** Berfore removing ***")
    assert(trie.contains("cut"))
    println("\"cut\" is in the trie")
    assert(trie.contains("cute"))
    println("\"cute\" is in the trie")
    println("\n*** After removing cut ***")
    trie.remove("cut")
    assert(!trie.contains("cut"))
    assert(trie.contains("cute"))
    println("\"cute\" is still in the trie")
}
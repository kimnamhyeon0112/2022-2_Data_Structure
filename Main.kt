fun main() {
    println(listOf("aaa", "bb", "c").sortedWith(compareBy { it.length }))
}
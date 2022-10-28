object MyStringComparator : Comparator<String> {
    override fun compare(o1: String, o2: String): Int {
        if (o1.isEmpty() || o2.isEmpty())
            return o1.length - o2.length
        return o1[0] - o2[0]
    }
}

fun main() {
    println("a".compareTo("bbb"))
    println(listOf("cccccccc", "azz", "z", "abb").sortedWith(MyStringComparator))
}
object TheThing {
    val items = arrayListOf<String>("A", "B")

    override fun toString(): String {
        var ret = "TheThing: "
        items.forEach {
            ret += it
        }
        return ret
    }
}

fun main() {
    TheThing.items.add("C")
    println(TheThing)
}
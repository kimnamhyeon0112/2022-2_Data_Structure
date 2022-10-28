object TheThing: ArrayList<String>() {
    fun descSelf() {
        println("TheThing: " + this.toString())
    }
}

fun main() {
    TheThing.add("A")
    TheThing.descSelf()
}
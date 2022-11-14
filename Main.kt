fun main() {
    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach() {
            if (it == 3) return
            print(it)
        }
        println("this point is unreachable")
    }

    fun poo() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit
            print(it)
        }
        print(" done with explicit label")
    }

    fun goo() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@forEach
            print(it)
        }
        print(" done with implicit label")
    }

    fun roo() {
        run loop@{
            listOf(1, 2, 3, 4, 5).forEach {
                if (it == 3) return@loop
                print(it)
            }
        }
        print(" done with nested loop")
    }
}
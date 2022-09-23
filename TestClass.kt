open class Animal (var age: Int)

class Cat(age: Int = 1, var name: String): Animal (age)
{
    fun talk()
    {
        print("${name}: ")
        for (i in 1..age)
        {
            print("야옹")
        }
        println()
    }
}
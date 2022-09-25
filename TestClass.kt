class Man(
    name: String,
    var age: Int,
    val job: String)
{
    var address: String = "Nowhere"
        get
        set(v) {field = "address: $v"}

    var cursed: Boolean = false
    var speed: Int = 100
        get() {return field - (if (cursed == true) 10 else 0)}

    val strength: Int = 50
        get
}

class Flower private constructor(val name: String) {
    companion object bud {
        private var numFlowers: Int = 0
        fun bloom(name: String): Flower? {
            if (numFlowers > 0)
                return null
            numFlowers += 1
            return Flower(name)
        }
    }

    override fun toString(): String {
        return "Flower $name"
    }
}

class Outer {
    val ov = 5
    class Nested{
        val nv = 10
        fun greeting() = "Nested"
        fun accessCompanionMethod(){
            println(country)
            getSomething()
        }
    }
    companion object{
        const val country = "Korea"
        fun getSomething() = println("Get Country")
        fun call_nested_greeting() {Outer.Nested().greeting()}
    }
    fun outside(){
        val msg = Nested().greeting()
        println(Nested().nv)
    }
}

class Smartphone(val model : String){
    private val cpu = "i5-8900"
    var name: String = "Noname"
    fun func1(){
        println("name is $name")
    }

    inner class Inner{
        fun which_cpu(){
            println(cpu)
            getSomething()
        }
    }
    companion object{
        const val country = "Korea"
        fun getSomething() = println("Get country")
        fun which_cpu(){
            println("I don't know")
        }
    }
}

sealed class Fruit1{
    class Apple():Fruit1()
    class Banana():Fruit1()
}

sealed class Fruit2
class Apple():Fruit2()
class Banana():Fruit2()

enum class WeekDay(val favor: Int){
    Sunday(80),
    Monday(0),
    Tuesday(10),
    Wednesday(20),
    Thursday(30),
    Friday(90),
    Saturday(100);

    fun showFavor(){
        println("I love ${this.name} ${this.favor}%")
    }
}

open class Animal (var age: Int)

class Cat(age: Int = 1, var name: String): Animal (age){
    constructor(age: Int): this(age, "Noname"){
        println("이름없는 고양이 생성됨.")
    }
    constructor(): this(name="Noname"){
        println("이름없는 고양이가 기본 나이로 생성됨.")
    }
    fun talk(){
        print("${name}: ")
        for (i in 1..age){
            print("야옹")
        }
        println()
    }
    fun helloToOther(c: Cat?){
        print("${name}: ")
        val isOlder = c?.let {
            it.age > this.age
        }
        when(isOlder){
            false -> println("(${c.name}에게)안녕.")
            true -> println("(${c.name}에게)안녕하세요.")
            else -> println("...")
        }
    }
}
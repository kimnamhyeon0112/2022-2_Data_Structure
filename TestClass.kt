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

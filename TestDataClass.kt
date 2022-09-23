data class TestDataClass(
    var a: Int,             // getter, setter 자동생성
    val b: String="Empty"   // getter 자동생성
)
{
    var c: Boolean = false

    override fun equals(other: Any?): Boolean
    {
        if (other == null || other !is TestDataClass)
            return false
        return this.a == other.a && this.b == other.b && this.c == other.c
    }
    override fun toString(): String
    {
        return "TestDataClass(a=$a, b=$b, c=$c)"
    }
}
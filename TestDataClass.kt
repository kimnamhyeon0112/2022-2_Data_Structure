data class TestDataClass(
    var a: Int,             // getter, setter 자동생성
    val b: String="Empty"   // getter 자동생성
)
{
    override fun toString(): String{
        return "Var a = $a, Val b = $b"
    }
}
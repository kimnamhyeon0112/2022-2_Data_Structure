fun main()
{
    var scores1 = arrayOf(100,90,80)
    var scores2: Array<Int>? = null
    print(scores1.size)
    print(scores2!!.size)    //!!(null이어도 강제로 size를 출력하게 함)
}
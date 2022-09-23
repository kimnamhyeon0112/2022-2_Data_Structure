fun main()
{
    var scores1 = arrayOf(100,90,80)
    var scores2: Array<Int>? = null
    print(scores1.size)
    print(scores2?.size)    //?를 붙여야 하는 이유는 scores2가 빈공간임에도 불구하고 size를 물어보기 때문에 ?가 없으면 오류가 난다
}
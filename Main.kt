fun main(){
    val stringBuilder = StringBuilder()

    stringBuilder.append("kotlin")
    stringBuilder.append("program")
    println("append 확인: " + stringBuilder.toString())

    stringBuilder.insert(0, "hello")
    println("insert 확인: " + stringBuilder.toString())

    stringBuilder.delete(0, 5)
    println("delete 확인: " + stringBuilder.toString())
}
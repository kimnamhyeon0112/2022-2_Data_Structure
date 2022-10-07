fun main() {
    var t_hashMap = HashMap<String, Any>()

    t_hashMap.put("name", "투케이")
    t_hashMap.put("age", 28)
    println("put 데이터: " + t_hashMap.toString())

    println("name 포함 여부:" + t_hashMap.containsKey("name"))

    println("name 데이터:" + t_hashMap.get("name"))

    for ((key, value) in t_hashMap) {
        println("전체: ${key}:${value}")
    }

    t_hashMap.remove("age")
    println("remove 데이터:" + t_hashMap.toString())

    t_hashMap.replace("name","케이투")
    println("replace 데이터:" + t_hashMap.toString())

    t_hashMap.clear()
    println("clear 데이터:" + t_hashMap.toString())



}
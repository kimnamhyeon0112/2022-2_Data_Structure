fun main() {
    // 전자가 존재해야 후자가 존재함
    var i1 = Smartphone("A32")
    var i2 = i1.Inner()

    // 남남인 관계
    var o1 = Outer()
    var o2 = Outer.Nested()

    // 후자는 전자가 존재하지 않더라도 상관없음
    var c1 = Smartphone("S7")
    var c2 = Smartphone.Companion
}
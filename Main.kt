import org.w3c.dom.css.Rect

open class Shape
class Rectangle:Shape()
fun Shape.getName() = "shape"
fun Rectangle.getName() = "rectangle"

fun printClassName(s:Shape) {
    println(s.getName())
}

fun main() {
    printClassName(Rectangle())
}
package id.ac.polbeng.serna.test_kelas

open class Rectangle {
    open fun draw() {
        println("From Base Class Rectangle")
    }
}
interface Polygon {
    fun draw() { // interface members are 'open' by default
        println("From interface Polygon")
    }
}
class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}
fun main() {
    val square = Square()
    square.draw()
}
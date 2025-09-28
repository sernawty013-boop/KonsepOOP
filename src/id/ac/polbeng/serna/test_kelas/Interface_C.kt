package id.ac.polbeng.serna.test_kelas

interface X {
    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}
interface Y {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}
// This class implements X and Y interfaces
class MyClassA: X, Y {
    override fun funcX() {
        println("Hello")
    }
    override fun funcY() {
        println("Hi")
    }
}
fun main() {
    val obj = MyClassA()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()
}
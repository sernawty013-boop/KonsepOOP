package id.ac.polbeng.serna.test_kelas

open class MyBase {
    // Must use "open" modifier to allow child classes to override it
    open fun think () {
        println("Hey!! i am thinking ")
    }
}
class MyDerived: MyBase() { // inheritance happens using default constructor
    // Must use "override" modifier to override a base class function
    override fun think() {
        println("I Am from Child")
    }
}
fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}
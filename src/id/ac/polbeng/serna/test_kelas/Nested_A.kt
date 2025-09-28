package id.ac.polbeng.serna.test_kelas

class OuterA {
    val a = "Outside Nested class."
    inner class Inner {
        fun callMe() = a
    }
}
fun main() {
    val outer = OuterA()
    println("Using outer object: ${outer.Inner().callMe()}")
    val inner = OuterA().Inner()
    println("Using inner object: ${inner.callMe()}")
}
package id.ac.polbeng.serna.test_kelas

fun main() {
    val meri = Student("Meri", 20)
    // Destructuring Declaration with componentN() method
    val name = meri.component1()
    val age = meri.component2()
    println("Name = $name")
    println("Age = $age")
}
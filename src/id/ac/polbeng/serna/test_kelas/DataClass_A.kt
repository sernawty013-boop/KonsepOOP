package id.ac.polbeng.serna.test_kelas

data class Student(val name: String, val age: Int)
fun main() {
    val boni = Student("Boni", 21)
    val meri = Student("Meri", 20)
    println("Student Name is: ${boni.name}")
    println("Student Age is: ${boni.age}")
    println("Student Name is: ${meri.name}")
    println("Student Age is: ${meri.age}")
}
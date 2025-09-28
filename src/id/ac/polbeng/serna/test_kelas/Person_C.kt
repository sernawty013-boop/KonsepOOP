package id.ac.polbeng.serna.test_kelas

class PersonC (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    val budi = PersonC("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}
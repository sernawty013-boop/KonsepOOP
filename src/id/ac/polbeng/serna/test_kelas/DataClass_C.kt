package id.ac.polbeng.serna.test_kelas

fun main(){
    val meri = Student("Meri", 20)
    val badu = meri.copy("Badu")
    if(meri.equals(badu))
        println("meri is equal to badu.")
    else
        println("meri is not equal to badu.")
    println("Hashcode of meri: ${meri.hashCode()}")
    println("Hashcode of badu: ${badu.hashCode()}")
}
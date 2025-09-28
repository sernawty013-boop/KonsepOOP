package id.ac.polbeng.serna.test_kelas

fun printNumber(n : Number){
    println("Using printNumber(n : Number)")
    println(n.toString() + "\n")
}
fun printNumber(n : Int){
    println("Using printNumber(n : Int)")
    println(n.toString() + "\n")
}
fun printNumber(n : Double){
    println("Using printNumber(n : Double)")
    println(n.toString() + "\n")
}
fun printNumber(n:Int, str:String){
    println("Using printNumber(n:Int, str:String)")
    println(str + n.toString() + "\n")
}
fun main(){
    val a: Number = 99
    val b = 1
    val c = 3.1
    printNumber(a)
    printNumber(b)
    printNumber(c)
    printNumber(b, "Overloading function ")
}
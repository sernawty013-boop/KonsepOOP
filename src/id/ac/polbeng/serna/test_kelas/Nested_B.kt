package id.ac.polbeng.serna.test_kelas

fun main() {
    // creating an instance of the interface
    var programmer: Human = object : Human {
        override fun think() { // overriding the think method
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}
interface Human {
    fun think()
}
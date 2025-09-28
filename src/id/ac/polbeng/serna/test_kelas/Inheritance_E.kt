package id.ac.polbeng.serna.test_kelas

open class NewPerson {
    open var age: Int = 1
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age cannot be negative")
        }
}

class CheckedPerson : NewPerson() {
    override var age: Int = 1
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age cannot be negative")
        }
}

fun main() {
    val person = NewPerson()
    try {
        person.age = -5  // Akan melempar exception
    } catch (e: IllegalArgumentException) {
        println("Error pada NewPerson: ${e.message}")
    }

    val checkedPerson = CheckedPerson()
    try {
        checkedPerson.age = -5  // Akan melempar exception juga
    } catch (e: IllegalArgumentException) {
        println("Error pada CheckedPerson: ${e.message}")
    }
}

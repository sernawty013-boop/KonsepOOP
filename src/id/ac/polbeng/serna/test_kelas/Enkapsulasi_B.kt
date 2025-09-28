package id.ac.polbeng.serna.test_kelas

class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() {
            return field.uppercase()
        }
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            } else {
                throw IllegalArgumentException("Age must be greater than zero")
            }
        }
}

fun main() {
    val emp = EmployeeA(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")

    try {
        emp.age = -1   // ini akan dilempar exception
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }

    println("Umur setelah percobaan update: ${emp.age}")
}

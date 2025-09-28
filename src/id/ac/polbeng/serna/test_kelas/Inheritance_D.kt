package id.ac.polbeng.serna.test_kelas

import java.text.NumberFormat
import java.util.*

open class EmployeeD {
    // Gunakan "open" supaya bisa dioverride oleh child class
    open val baseSalary: Int = 3000000
}

class Programmer : EmployeeD() {
    // Override property dari class induk
    override val baseSalary: Int = 5000000
}

class SoftwareEngineer : EmployeeD() {
    override val baseSalary: Int = 6000000
}

class ProjectManager : EmployeeD() {
    override val baseSalary: Int = 8000000
}

fun toRupiahFormat(baseSalary: Int): String {
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    return numberFormat.format(baseSalary)
}

fun main() {
    val employee = EmployeeD()
    println("Rata-rata gaji ${employee.javaClass.simpleName} = ${toRupiahFormat(employee.baseSalary)}")

    val programmer = Programmer()
    println("Rata-rata gaji ${programmer.javaClass.simpleName} = ${toRupiahFormat(programmer.baseSalary)}")

    val softwareEngineer = SoftwareEngineer()
    println("Rata-rata gaji ${softwareEngineer.javaClass.simpleName} = ${toRupiahFormat(softwareEngineer.baseSalary)}")

    val projectManager = ProjectManager()
    println("Rata-rata gaji ${projectManager.javaClass.simpleName} = ${toRupiahFormat(projectManager.baseSalary)}")
}

package kotlin_oops_concepts.InheritanceExample.secondary_base

fun main(arge: Array<String>){
    var student = Student("Ravi",24,1)
    student.studying();
    student.walk()

    var employee = Employee(2, 25, "Ravivarma")
    employee.work()

    var employee2 = Employee(2)
    employee2.work()
}
package kotlin_oops_concepts.InheritanceExample.primary_base

fun main(args : Array<String>){
    var student = Student()
    student.age = 26
    student.name = "Ravivarma"
    student.studentId = 1;
    student.studying();
    println(student.walk());
    println()

    var employee = Employee(2, "varma" , 30)
    employee.working();
    println(employee.walk())
}
package kotlin_oops_concepts.InheritanceExample.primary_base

class Employee : Human{
    var empId : Int = 0;
    constructor(empId : Int, name : String, age : Int) {
        this.empId = empId
        super.name = name
        super.age = age;
    }

    fun working(){
        println("${empId}, ${name}, ${age}")
    }
}
package kotlin_oops_concepts.InheritanceExample.secondary_base

class Employee : Human {
    var empID : Int = 0

    constructor(id : Int, age : Int, name : String) : super(name, age){
        empID = id
    }
    constructor(id : Int){
        empID = id
    }

    fun work(){
        println("${name}, ${age}, ${empID}")
    }
}
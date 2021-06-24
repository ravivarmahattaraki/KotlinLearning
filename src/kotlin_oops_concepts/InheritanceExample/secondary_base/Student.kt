package kotlin_oops_concepts.InheritanceExample.secondary_base

class Student(name: String, age:Int, id: Int) : Human(name,age){
    var studentId : Int = id;
    fun studying(){
        println("${name}, ${age}, ${studentId}")
    }

}
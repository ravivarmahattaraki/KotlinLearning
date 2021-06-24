package kotlin_oops_concepts.InheritanceExample.primary_base

class Student : Human() {
    var studentId : Int = 0;
    fun studying(){
        println("My name is ${name}, and mu age is ${age}, i am studing")
    }
}
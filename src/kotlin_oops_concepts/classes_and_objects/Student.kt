package kotlin_oops_concepts.classes_and_objects

class Student {
    var age : Int = 0;
    var name : String? = null

    val school : String = "GSHB"

    fun addStudent(age : Int, name : String?){
        this.age = age;
        this.name = name
    }

    fun displayStudent() : String{
        return "My name is ${this.name} and My age is ${this.age} and school name is ${this.school}"
    }
}
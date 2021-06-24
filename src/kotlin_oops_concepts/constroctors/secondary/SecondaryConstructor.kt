package kotlin_oops_concepts.constroctors.secondary

fun main(args : Array<String>){
    var student = Student(24, "Ravivarma")
    println(student.display())

    var student2 = Student(24,"Ravivarma", Student.School("GHSB"))
    println(student2.display())

    //Combination of Secondary constructor
    var studentOne = StudentOne(1,"Ravi","KP")
    println(studentOne.display())

    var studentOne2 = StudentOne("G")
    println(studentOne2.display())

}

class StudentOne(var schoolName : String) {
    var age : Int = 0
    var name : String? = null

    constructor(age:Int, name:String, sc : String):this(sc){
        this.age = age
        this.name = name
    }

    fun display() : String{
        return "${name}, ${age}, ${schoolName}"
    }
}
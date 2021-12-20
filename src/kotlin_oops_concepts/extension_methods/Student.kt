package kotlin_oops_concepts.extension_methods

class Student {
    fun result(marks : Int){
        if(marks > 35){
            println("passed")
        }
    }

    fun Student.isTopper(marks : Int) : Boolean{
        return marks > 90
    }
}

fun Student.isTopper(marks : Int) : Boolean{
    return marks > 90
}

fun main(args : Array<String>){
    var s1 = Student()
    println(s1.result(50))
    println(s1.isTopper(95));
}
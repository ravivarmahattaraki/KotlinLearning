package kotlin_oops_concepts.constroctors.primary

fun main(args : Array<String>){
    var student = Student(25, "Ravivarma")
    student.display()


}

class StudentOne(var age : Int, var name : String){

    fun display(){
        println("${age} ${name}")
    }
}

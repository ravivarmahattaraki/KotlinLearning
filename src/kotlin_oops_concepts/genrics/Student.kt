package kotlin_oops_concepts.genrics

class Student<T>(id : T) {
    var id : T = id
    fun print(){
        println(id)
    }
}

fun main(arg : Array<String>){
    var s = Student(30)
    s.print();

    var s2 = Student("40")
    s2.print()
}
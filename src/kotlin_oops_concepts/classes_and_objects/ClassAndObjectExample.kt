package kotlin_oops_concepts.classes_and_objects

fun main(args : Array<String>){
    var studentObj = Student()
    studentObj.addStudent(26,"Ravivarma")
    println(studentObj.displayStudent())

    var studentObj2 = Student()
    studentObj2.addStudent(24,"chandravarma")
    println(studentObj2.displayStudent())

    var studentObj3 = Student()
    studentObj3.addStudent(40,null)
    println(studentObj3.displayStudent())

}
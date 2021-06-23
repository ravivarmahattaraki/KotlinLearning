package kotlin_oops_concepts.kotlin_nested_and_inner_classes

fun main(args : Array<String>){
    //create only school object
    var obj = Student()
    obj.setNameAndAge("Ravi", 26)
    println(obj.display())


    //create obly Dress code
    var obj1 = Student.DressCode()
    obj1.setColor("green")
    println(obj1.printColor())


    var  obj2 = Student()
    obj2.setNameAndAge("Chandra", 25)
    println(obj2.displayWithDressCode())

    //Nested class example
    var obj3 = Student()
    Student.DressCode();
    var dressCode = Student.DressCode()
    dressCode.setColor("Red")
    obj3.setNameAndAgeWithColor("varma" ,30,dressCode)
    println(obj3.displayWithDressCode())



    //Inner class example
    var obj4 = Student()
    var dressCode1 = Student.DressCode()
    var school = obj4.School()

    school.setSchoolName("CBSC")
    dressCode1.setColor("purple")
    obj4.setNameAndAgeWithColor("Ravivarma", 29,dressCode1)

    println(school.getSchholdName())

    println(school.getStudentWithSchool())
}
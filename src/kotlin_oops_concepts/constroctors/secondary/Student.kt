package kotlin_oops_concepts.constroctors.secondary

class Student {
    private var age : Int = 0
    private var name : String? = null
    private var school : School? = null
    constructor(age : Int, name : String)
    {
        this.age = age;
        this.name = name
    }
    constructor(age : Int, name: String, school: School){
        this.age = age;
        this.name = name
        this.school = school
    }
    fun display() : String{
        return "my Name is ${name}, age = ${age}, ${school?.display()}"
    }

    class School(name : String){
        var name : String? = name
        fun display() : String{
            return "School name is ${name}"
        }
    }
}
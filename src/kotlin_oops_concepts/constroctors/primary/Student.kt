package kotlin_oops_concepts.constroctors.primary

/**
 * primary cunstructor with init block
 * */
class Student(age : Int, name : String) {
    private var mAge : Int = age
    private var mName : String? = name

   /* init {
        mAge = age
        mName = name

    }*/


    fun display(){
        println("My naem is  ${mName} age is ${mAge}")
        //println(name)//Error
    }
}
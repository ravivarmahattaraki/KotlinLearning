package kotlin_oops_concepts.kotlin_nested_and_inner_classes

class Student {
    private var name : String? = null;
    private var age : Int = 0
    private  var dressCode : DressCode? = null


    fun setNameAndAge(name : String, age : Int){
        this.name = name;
        this.age = age;
    }
    fun display() : String{
        return "My naem is ${name}, and age is ${age}"
    }


    fun setNameAndAgeWithColor(name : String, age : Int, dressCode: DressCode){
        this.name = name;
        this.age = age;
        this.dressCode = dressCode
    }
    fun displayWithDressCode() : String{
        return "My naem is ${name}, and age is ${age}, Dress code is ${dressCode?.printColor()}"
    }

    class DressCode{
        private var color : String? = null

        fun setColor(color : String){
            this.color = color
        }

        fun printColor() : String{
            return "Dress code is ${color}"
        }

        public  fun dipslayName(){
            // in nestedclass we cannot access data members of outer class
            //println(name)
        }
    }

    inner class School{

        private var schoolName : String? = null

        fun setSchoolName(str : String){
            this.schoolName = str
        }
        fun getSchholdName() : String{
            return "schools name is ${this.schoolName}"
        }

        fun getStudentWithSchool() : String{
            return "My name ${name} age is ${age},  ${dressCode?.printColor()}, svhool name ${schoolName}"
        }
    }
}
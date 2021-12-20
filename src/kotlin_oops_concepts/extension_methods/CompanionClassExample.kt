package kotlin_oops_concepts.extension_methods

fun main(args : Array<String>){
    Student1.name("Ravi")
    Student1.Id(1)
}
/* cannot declare same class in kotlin file if already exist in package
class Student{

}*/
fun  Student1.Companion.Id(id : Int){
    println(id)
}

/*fun  Student1.Companion.name(name: String){
    println(name)
}*/
class Student1{
    companion object{
        fun name(name : String){
            println(name);
        }
    }
}

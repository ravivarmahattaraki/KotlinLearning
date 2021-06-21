package null_safety

fun main(args : Array<String>){
    var obj = ExampleOne()
    obj.printMsg3()
}
class ExampleOne{
    var s : String? = null
    fun printMsg() {
        println(s)
        s = "ravi"
    }

    var s1 : String = "hello"
    fun printMsg1(){
        println(s1)
        //s1 = null Error
    }

    val name : String? = "Ravivarma"
    val lnama : String = "Hattaraki"
    fun printMsg2(){
        //println(name.length)//compilation Error
        if(name != null){
            println(name.length)
        }

        println(lnama.length)
    }

    val name1 : Any = "Ravivarma"
    fun printMsg3(){
        if(name1 is String){
            println("${name1} length is ${name1.length}")
        }

        if(name1 !is String){
            //println("${name1} length is ${name1.length}")//error because of smart cast
        }else{
            println("${name1} length is ${name1.length}")
        }

        //println("${name1} length is ${name1.length}")//Error
    }
}
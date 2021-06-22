package null_safety

fun main(args : Array<String>){
    var obj = ExampleOne()
    obj.elvisOperator()
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

    val name2 : Any? = null;
    val name3 : String = "Ravi"
    val name4 : Int = 8
    val name5 : Any = 4;

    val name6 : Any = "Ravivarma"
    val name7 : Any =123
    fun printMsg4(){
        //val temp : String = name2 as String//Error
        //println(temp)

        val temp1 : String = name3 as String
        //println(temp1)

        //val temp2 : String = name4 as Int//Error

        //val temp3 : String = name5 as String//Error
        //println(temp3)

        val temp4 : Int? = name6 as? Int
        val temp5 : String? = name6 as? String
        println(temp4)
        println(temp5)

        //unsafe casting
        //val temp6 : String = name7 as String//Error
        /*val temp6 : String = name7 as String
        println(temp6)*/

        val temp7 : Int = name7 as Int
        println(temp7)

        //safe casting
        val temp8 : String? = name7 as? String
        println(temp8)
    }

    fun elvisOperator(){
        var str : String? = null
        var str1 : String? = "Ravivarma"

        var n : Int = if (str != null) {
            str.length
        }else{
            -1;
        }
        println(n)

        var n1 : Int = if(str1 != null){
            str1.length
        }else{
            -1
        }
        println(n1)


        //Elvis operator
        var str2 : String? = null
        var str3 : String? = "Ravivarma"

        var n2 : Int = str2?.length ?: -1;
        println(n2)

        var n3 : Int = str3?.length ?: -1
        println(n3)
    }
}
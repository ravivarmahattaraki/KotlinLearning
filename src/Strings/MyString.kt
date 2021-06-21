package Strings

fun main(args : Array<String>){
    var str = """ I am ravivarma
        i am android developer
    """

    //println(str)


    var str1 = """ I am ravivarma
        ai am android developer
    """.trimMargin("a")

    //println(str1)



    val str3 = "Hello, World!"
    val str4 = "Hello, World!"
    println(str3==str4) //true


    val str5 = "Hello, World!"
    val str6 = "Hello, World"
    println(str5===str6)
}
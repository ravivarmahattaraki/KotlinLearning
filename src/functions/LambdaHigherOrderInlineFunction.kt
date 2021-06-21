package functions

fun main(args : Array<String>){
    val obj = Functions()
    println("Sum is ${obj.normalLambdaFunTwo}")

    obj.printSum(100,200,obj.normalLambdaFun);

    obj.printSum2(500,500,::sum)

    obj.inlineFun1({ println("Hello")})

    obj.inlineFun2(20,30, obj.normalLambdaFun)

    println(obj.printName())
}
fun sum(a : Int, b : Int) : Int{
    return a+b;
}

class Functions{

    /** normal function
     * */
    fun sum(a : Int, b : Int) : Int{
        return a+b;
    }

    /** normal lambda function
     * */
    var normalLambdaFun = {a : Int, b : Int -> a+b}

    var normalLambdaFunTwo : (Int, Int) -> Int = {a,b -> a+b}


    /** Higher Order function
     * */

    fun printSum(a : Int, b : Int, funCall : (Int,Int)->Int){
        println(" a = $a and b = $b sum is ${funCall(a,b)}")
    }

    fun printSum2(a : Int, b : Int, funCall : (Int, Int)->Int){
        println("a = $a and b = $b sum is ${funCall(a, b)}")
    }

    fun printName() : ()->String{
        return { "Returned from Higher order function"}
    }

    /** Inline function
     * */
    inline fun inlineFun1(fun1 : ()->Unit){
        fun1();
    }

    inline fun inlineFun2(a : Int, b : Int, fun1 :(Int, Int) -> Int){
        println(fun1(a, b))
    }
}


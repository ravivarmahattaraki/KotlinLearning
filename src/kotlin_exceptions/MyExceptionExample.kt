package kotlin_exceptions

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.RuntimeException

fun main(args : Array<String>){
    val obj = ExceptionAsExpression()
    //println("value = "+obj.returnException1(0))
    try {
        obj.validateAge(41);
    }catch (e : AgeException){
        e.printMessage()
    }
}
class ExceptionAsExpression{
    fun returnException(value : Int) : String{
        return try {
            (10/value).toString()
        }catch (e : ArithmeticException){
            "Exception devide by zero"
        }
    }

    fun returnException1(value : Int) : String{
        return try {
            (10/value).toString()
        }catch (e : ArithmeticException){
            println("Exception found")
            return "AE exception"
        }finally {
            println("finaly block code")
        }
    }

    fun multipleCatch(value : Int) : String{
        return try{
            (10/value).toString()
        }catch (e : RuntimeException){
            "general exception"
        }catch (ae : ArithmeticException){
            "Exception devide by zero"
        }
    }

    fun validateAge(age : Int){
       if(age > 18 && age < 45){
           println("correct age")
       }else{
           throw AgeException();
       }
    }
}


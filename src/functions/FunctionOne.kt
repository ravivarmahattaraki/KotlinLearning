package functions

import java.util.*

fun main(args : Array<String>){


    var obj = DefaultAndNamedArguments()
    obj.call();
}
class FunctionExample{
    fun readValues(a : Int, b : Int) : Double{
        return (a+b).toDouble();
    }
}


/** Recusrion */
class RecursionExample{
    var number : Int = 0;
    var sum : Int = 0;
    fun readNumber(){
        println("Enter number")
        var scanner = Scanner(System.`in`)
        number = scanner.nextInt();
    }

    /** normal recursion
     *  number 100000 stack overflow exception
     *  to avoid use Tail recusrion
     * */
    tailrec fun findSumOfNNumber(number : Int) : Int{

        sum += number;
        return if(number <= 1){
            sum
        }else{
            findSumOfNNumber(number - 1)
        }
    }

    /** Tail recursion*/
    tailrec fun findSumOfNumberTailRecursion(number : Int, sumResult : Int) : Int {
        return if (number <= 0) {
            sumResult
        } else {
            findSumOfNumberTailRecursion((number - 1), sumResult + number)
        }
    }
}

/** Default adn name Arguments */
class DefaultAndNamedArguments{
    fun call(){
        //display() //error function arguments are not initilized
        displayV2();

        displayV2(10);

        /**Error compiler does not understand string is passed as first arguments
         * use nameed argumnets
         * */
        //displayV2("Ravi")

        /** Named arguments
         * */
        displayV2(name = "Ravi");
    }



    fun display(number : Int, name : String){
        println("Number is $number and Name is $name");
    }

    fun displayV2(number : Int = 0, name : String = "Null"){
        println("Number is $number and Name is $name");
    }
}

package control_statement

import java.util.*

fun main(args : Array<String>){

    val forLoopObject = ForLoop();
    forLoopObject.displayInRange();


}

class ForLoop{
    val weeks = arrayOf("sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
    val inputScanner = Scanner(System.`in`);

    fun displayWeeks(){
        for (item in weeks){
            println(item);
        }
    }

    fun displayWeeksWithIndices(){
        //indices are index
        for(item in weeks.indices){
            println("$item = ${weeks[item]}")
        }
    }

    fun displayInRange(){
        println("Enter Range")
        val from = inputScanner.nextInt();
        val to = inputScanner.nextInt();

        for(item in from..to){
            println("$item = ${weeks[item]}")
        }

        //display in reverse
        println("Reverse order")
        for(item in to downTo from){
            println("$item = ${weeks[item]}")
        }

        //display with step
        println("step value")
        val step = inputScanner.nextInt()
        for(item in from..to step step){
            println("$item = ${weeks[item]}")
        }
    }
}

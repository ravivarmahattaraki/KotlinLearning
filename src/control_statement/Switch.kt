package control_statement

import java.util.*

fun main(args : Array<String>){
    val switchAsExpession = SwitchAsExpression();
    switchAsExpession.enterMonth();
    switchAsExpession.displayMonthRange();

}

class SwitchAsExpression{
    private val scanInput = Scanner(System.`in`)
    private var num : Int = 0
    private var week : String =""

    fun readInput(){
        println("enter number")
        num = scanInput.nextInt();
    }
    fun displayWhenAsExpression(){
        val result = when(num){
            1 -> "one"
            2 -> "Two"
            3 -> "three"
            4 -> "four"
            5 -> "five";
            else -> "other number"
        }

        println(result)
    }

    fun displayWhenAsNormal(){
        when(num){
            1 -> println("one")
            2 -> println("Two")
            3 -> println("Three")
            4 -> println("four")
            5 -> println("five")
        }
    }

    fun readWeek(){
        println("Enter week")
        week = scanInput.next();
    }

    fun displayWeek(){
        when(week){
            "monday" ->
            {
                println("entered is monday")
                print("first day")
            }
            "tuesday" ->
            {
                println("tuesday")
                print("second day")
            }
            else ->
            {
                println("invalid day")
            }
        }
    }

    fun enterMonth(){
        println("Enter the month")
        num = scanInput.nextInt();
    }

    fun displayMonthRange(){
        when(num){
            3,4,5,6 ->
            {
                println("entered month is summer")
            }

            7,8,9,10 ->
            {
                println("entered month is rain")
            }

            11,12,1,2 ->
            {
                println("enterd month is cold")
            }
            else ->
            {
                println("invalid month")
            }
        }
    }

}
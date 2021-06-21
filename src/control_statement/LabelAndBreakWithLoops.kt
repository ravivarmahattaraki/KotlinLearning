package control_statement

import java.lang.System.out
import java.util.*

fun main(args : Array<String>){
    val scanner = Scanner(System.`in`)

    val to = scanner.nextInt()
    val from = scanner.nextInt()

    val obj = LabelAndBreak();
    obj.display(to, from)
}

class LabelAndBreak{
    fun display(to : Int, from : Int){
        loop@ for(i in to..from){
            for(j in to..from){
                println("i = $i and j = $j")
                if(i == 2){
                    break@loop
                }
            }
        }
    }
}
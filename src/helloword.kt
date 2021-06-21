import java.util.Scanner

fun main(args : Array<String>){
    println("Enter 3 numbers");

    val scannerInput = Scanner(System.`in`);
    val num1 = scannerInput.nextInt();
    val num2 = scannerInput.nextInt();
    val num3 = scannerInput.nextInt();

    var m : Array<String>

    val biggestNumber = if(num1 > num2){
            val max = if(num1 > num3){
                num1
            }else{
                num3
            }

            max
        }else if(num2 > num3){
            num2
        }else{
            num3
        }

    println("biggest number is $biggestNumber");

    /*if(num1 > num2){
        println("biggest number is $num1")
    }else{
        println("biggest number is $num2")
    }*/
}

class Person{
    var name : String = ""
}

//https://proandroiddev.com/working-with-nfc-tags-on-android-c1e5af47a3db
//Android NFC api
package kotlin_exceptions

import java.lang.RuntimeException

public class AgeException : RuntimeException() {
    fun printMessage(){
        print("Invalid age")
    }
}
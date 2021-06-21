package kotlin_interoperable

import kotlin_interoperable.call_java_from_kotlin.MyJavaClass

fun main(args: Array<String>) {
    val sum= MyJavaClass.add(5, 10)
    println("printing sum inside Kotlin file: "+sum)


    var javaObj = MyJavaClass()
    javaObj.display()
}
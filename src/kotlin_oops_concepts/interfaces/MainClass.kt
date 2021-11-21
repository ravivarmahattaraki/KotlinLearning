package kotlin_oops_concepts.interfaces

import com.sun.tools.javac.Main

fun main(args : Array<String>){
    val myClassObj = MyClass()
    println(myClassObj.printData());
    myClassObj.doWork()

    val myInterfaceOne : MyInterfaceOne = MyClass()
    println(myInterfaceOne.printData())
    myInterfaceOne.doWork()
}
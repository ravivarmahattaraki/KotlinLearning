package kotlin_oops_concepts.interfaces

class MyClass : MyInterfaceOne,MyInterfaceTwo {
    override fun printData(): String {
        return "My class"
        //println("My class")
    }

    override fun doWork() {
        println("My class is working")
    }
}
package kotlin_oops_concepts.InheritanceExample.secondary_base

open class Human {
    var name : String? = null
    var age : Int = 0;

    constructor(name:String, age:Int){
        this.age = age
        this.name = name
    }
    constructor(){

    }
    fun walk(){
        println("${name} is walking")
    }
}
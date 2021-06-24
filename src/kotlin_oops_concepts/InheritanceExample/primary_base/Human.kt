package kotlin_oops_concepts.InheritanceExample.primary_base

open class Human {
    var name : String? = null;
    var age : Int = 0;

    fun walk() :String {
        return "$name is walking"
    }
}
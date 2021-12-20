package kotlin_oops_concepts.genrics

import kotlin_oops_concepts.extension_methods.swap

fun main(arg : Array<String>){
    val intList = arrayListOf<Int>(1,2,3,4,5)
    println(intList.Swap(0,4))

    println()
    val stringList = arrayListOf<String>("Ravi", "Ruvi", "Rupa")
    println(stringList.Swap(0,2))

}
fun <T>ArrayList<T>.Swap(i : Int,j : Int) : ArrayList<T>{
    val tmp = this[i];
    this[i] = this[j]
    this[j] = tmp
    return this;
}
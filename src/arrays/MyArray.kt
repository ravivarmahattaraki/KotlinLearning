package arrays

fun main(args : Array<String>){

    var arrayExampleOne = ArrayExampleOne()
    arrayExampleOne.display()

}
class ArrayExampleOne{
    var array = Array(4, {i -> i * 1} )

    fun display(){
        for(item in array){
            println(item)
        }
    }
}
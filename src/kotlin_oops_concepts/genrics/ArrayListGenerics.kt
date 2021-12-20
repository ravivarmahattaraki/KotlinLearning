package kotlin_oops_concepts.genrics

class ArrayListGenerics() {
    fun <T>print(list : ArrayList<T>){
        for (ele in list){
            print(ele)
        }
        println()
    }
}
fun main(args : Array<String>){
    val stringList = arrayListOf<String>("Ravi","Rupa","Ruvi")
    val inList = arrayListOf<Int>(1,2,3,4,5);

    val list = ArrayListGenerics();
    list.print(stringList)
    list.print(inList)
}
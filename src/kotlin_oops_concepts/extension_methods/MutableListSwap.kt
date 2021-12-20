package kotlin_oops_concepts.extension_methods

fun main(args : Array<String>){

    val list = mutableListOf<Int>(5,10,15)
    println(list)
    println(list.swap(0,2));

    /*val list1 : MutableList<Int> ;
    println(list1.swap(0,1))*/
}

//extension fun with nul reference
fun MutableList<Int> ?.swap(i : Int, j :Int) : Any{
    if(this == null){
        return "null"
    }else{
        var tmp = this[i];
        this[i] = this[j];
        this[j] = tmp;
        return this;
    }
}
package kotlin_oops_concepts.data_class

    fun main(args : Array<String>){
        val p = Product("p1", 1);
        println(p)//prints object address

        val p2 = Product2("p2", 2);
        println(p2)//prints object address

        //Hash code
        val p3 = Product("p3", 3);
        val p4 = Product("p3", 3);

        println("Hash code")
        println(p3 == p4)
        println(p3.equals(p4))

        val p5 = Product2("p5", 4)
        val p6 = Product2("p5", 4)
        println()
        println(p5 == p6)
        println(p5.equals(p6))


        //default arguments
        val p7 = Product3();
        println()
        println(p7)

        //copy()
        val p8 = Product3();
        var p9 = p8.copy()
        println()
        println("copy from p8 to p9 $p8 -----> $p9")

        p9 = p8.copy("p9", 10000);
        println("copy from p8 to p9 altered values $p8 -----> $p9")

    }


class Product( name : String, id : Int)

data class Product2( var name : String, var id : Int)

data class Product3( var name : String = "defualt", var id : Int = 0)

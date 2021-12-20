package kotlin_oops_concepts.sealed_class

sealed class SealedCar {
    class Audi(var name : String) : SealedCar()

    class Bugati(var name : String) : SealedCar()


}
fun print(e : SealedCar){
    when(e){
        is SealedCar.Audi -> println("This is ${e.name}")
        is SealedCar.Bugati -> println("This is ${e.name}")
        else -> print("Errror no car")
    }
}
class MyCar : SealedCar(){

}

fun main(args : Array<String>){
    var audi = SealedCar.Audi("Audi")
    var bugati = SealedCar.Bugati("Bugati")

    print(audi);
    print(bugati)

}
fun main(args: Array<String>){
    var result = listOf<Int>(1,3,4,6)
    for ((i: Int,j:Int) in result.withIndex())
    println("$i :$j")
}//to add in mutablelist<mutablelistOf()> eg:
  // number.add(5)
// number.removeAt(index:1)
// number.shuffle()
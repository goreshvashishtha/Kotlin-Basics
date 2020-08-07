fun main(args: Array<String>){
    val numbers = setOf<Int>(2,4,5,6)   //create a set
    println("Number of element: ${numbers.size}")  //print a size of set
    if (numbers.contains(1)) println("1 is present in the set")  //checking condition
    else println("1 is not present in set")

    val numberb = setOf<Int>(6,5,4,2) //Create a set in reverse order
    println("The sets are equal :${numbers==numberb}") //checking both sets are equal or not
}
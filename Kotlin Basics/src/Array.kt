import java.util.*

fun main(args : Array<String>){
    var num = arrayOf(1,2,3,4,5)
    println(Arrays.toString(num))
    println(num[3]) //print index number
    num[4]=20 //change the value of index
    println(num[4]) //checking the changing value by printing it
    println(num.get(2)) //print index number using get function
    num.set(0,100)  // changing values of index using set function
    println(num.get(0)) //checking the index values
    println(num.first()) //printing first element using first function
    println(num.last()) //printing last element using last function
}
import java.util.*

fun main(args: Array<String>){
    var num = arrayOf(1,2,3,4,5) // define an array
    val SortedNumber = num.sortedArray() // sorting array using sortedArray method
    println(Arrays.toString(SortedNumber)) //printing sorted Array
    val SortedDecNumbers = num.sortedArrayDescending() // sorting Array in Decending using sortedArrayDescending method
    println(Arrays.toString(SortedDecNumbers))// printing an Sorted array


    val array = arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(7,8)) //defining 2D array
    println(Arrays.deepToString(array)) //printing 2D array using Arrays.deeptoString method
}
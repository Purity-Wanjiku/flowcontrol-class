import kotlin.reflect.typeOf

fun main() {
     ageClassifier(3)
    ageClassifier(23)
    ageClassifier(14)

    agegroup(1)
    agegroup(4)
    agegroup(13)
    agegroup(28)

    agetype(0)
    agetype(3)
    agetype(15)
    agetype(23)

    nationality("Rwanda")

    details()

    var dets = sumArray(arrayOf("hopperlad","Ada",57,32.5, "nairobi",62.37,"karen","judy","false"))
    println(dets)
}
fun ageClassifier(age: Int){
    if (age in 13..17){
        println("You are a teenager")
    } else{
        println("You are not a teenager")
    }
    }

//baby 1, toddler 2-5, child 6-17, adult 18+
fun agegroup(age: Int){
    if (age <= 1){
        println("baby")
    }else if (age in 2..5){
        println("toddler")
    }else if (age in 6..17){
        println("child")
    }else{
        println("adult")
    }
}
//better way using when statement

fun agetype(age: Int){
    when (age){
        in 0..1 -> println("baby")
        in 2..5 -> println("toddler")
        in 6..17 -> println("child")
        else -> println("adult")
    }
}
//works with strings as well
//write a function that takes in a country name
//prints out corresponding nationality
//for country Rwanda, Ghana, Portugal, Wales

fun nationality(country: String){
    when (country){
        "Rwanda" -> println("Rwandan")
        "Ghana" -> println("Ghanaian")
        "Portugal" -> println("Portuguese")
        "Wales" -> println("Welsh")
        else -> println("Null")
    }
}
//The for loop is used to iterate over collections like lists, arrays, strings and ranges.
fun details(){
    val languages = arrayOf("Kiswahili", "English", "Muslim")  //collection is called languages
    for (x in languages){
        println("I speak $x")
    }
}
//write a function that takes in an array of random integers and prints out whether each is odd or even
fun numCheck(number: Array<Int>) {
    for (num in number) {
       if (num%2 == 0) {
           println("even")
       } else {
           println("odd")
       }
   }
}
//write a function that takes in an array of mixed types and returns the sum of the decimal elements only.
//["hopperlad","Ada",57,32.5, "nairobi",62.37,"karen","judy","false"]

fun sumArray(values:Array<Any>):Double {
    var sum = 0.0
    for (x in values){
        if (x is Double) {  //check how to use and and or
         sum += x
        }
}
return sum
}
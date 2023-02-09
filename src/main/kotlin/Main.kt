fun main(){
    name()
   // var result = div(1897.3 ,15.0)
  // println(result)
    var result = add(64,86,98,37)
    println(result)
    funfact()
}

fun name(){
    var name = "rita"

    println("hello" +"  " +name)
}

fun div( num1: Double, num2:Double): Double{
    var division = num1 / num2
    return division
}

fun add(num1:Int,num2:Int,num3:Int,num4:Int): Int{
    var sum = num1 + num2 + num3 + num4
    return sum
}

fun funfact(){
    var fact = "I enjoy listening to music"
    println(fact)
}
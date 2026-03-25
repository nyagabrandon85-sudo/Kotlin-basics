
fun main(){
    //strings
    val course="MIT"
    val last_name:String="Martin"
    println("i am learning $course")
    println("My name is $last_name")
    //numbers:integers-whole numbers
    val age: Int=20
    println("age is $age")
    //long
    val mynum: Long=10000055445L
    println("My long integers is $mynum")
    println(mynum::class)
    println(age::class)
    //byte
    val newnum:Byte=10
    print(newnum)
    //short
    val x: Short=300
    print(x)
    //floating point numbers-float
    val tax:Double=10.6
    println(tax)
    val y: Float=29.96f
    println(y)
    //character type-used to store single character
    val grade:Char='A'
    println(grade)
    //boolean-true or false
    val is_student=true
    println(is_student::class)
    //typeconversion toInt(), toFloat(), toShort()
    val z:Float=30.78f
    println(z)
    println(z.toInt())

}
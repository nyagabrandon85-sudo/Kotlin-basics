//function- a block of code that performs a specific tasks
fun main(){
    println("Hello from main function")
    //calling the function
    firefox()
    firefox()
    greetings(name="Brandon",age=19)
    greetings(name="Vivian",age=24)
    greetings(name="Luke")
    //store the returned value ina variable
    var result=addTwoNumbers(x=65, y=34)
    println(result)
    //print the returned value
    println(addTwoNumbers(x=82, y=45))
    println(multiply(a=15, b=15))
}
//another function
fun firefox(){
    println("Hello this is a kotlin function")
}
//function with parameters greetings
fun greetings(name: String, age: Int=18){
    println("Hello $name, you are $age years old" )
}
//function with return keywords
fun addTwoNumbers(x:Int, y:Int): Int{
    return x + y

}
//function that multiplies two numbers
//shorthand function
fun multiply(a:Int, b:Int)=a * b
//function that calculates area of a rectangle(length*width)
//function that calculates area of a circle(3.14*r*r)











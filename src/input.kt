fun main(){
    print("enter your name?: ")
    var user_name=readLine()
    println("How old are you?")
    var age=readLine()
    println("Hello good afternoon $user_name,you are $age years old")
    //asks user for two numbers and display the samples
    print("enter first number:")
    var num1=readLine()!!.toInt()
    print("enter second number:")
    var num2=readLine()!!.toInt()
    var sum=num1 + num2
    println("Sum is $sum")
}
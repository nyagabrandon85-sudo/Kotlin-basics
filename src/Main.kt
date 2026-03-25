fun main() {
    println("Hello World")
    println("This is Kotlin")
    println("My name is Brandon")
    //variables are containers for storing values
    //val-used to declare variables that are unchangeable
    //var-used to declare variables that values will change
    val first_name = "Brandon"
    println(first_name)
    var age = 19
    println(age)
    age = 21
    println(age)
    //display strings and variables
    println("Hello! My name is " + first_name)
    //string interpolation $variablename
    println("My name is $first_name and am $age years old")
    val course = "Kotlin"
    println("I am learning $course")
}
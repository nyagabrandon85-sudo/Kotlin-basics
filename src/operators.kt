//arithmetic operators +, -, *, /, %
fun main() {
    var x=120
    var y=57
     //+, addition
    println("the sum of $x and $y is ${x+y}")
     //-, minus
    println("the difference of $x and $y is ${x-y}")
     //*, multiplication
    println("the multiplication of $x and $y is ${x*y}")
    ///, division
    println("the division of $x and $y is ${x/y}")
    // modulus_%_ the remainder od division
    println("the remainder of division of $x and $y is ${x%y}")
    //increment-adds 1 to variable
    ++x //x=x+1
    println("The new value of y us $y")
    //assignment operators-used to assign values to variables =
    var a=30
    println("a is $a")
//logical operators and &&, or, ||, not !
//and && returns true if both statements are true
    var b = 5
    println(b > 3 && b < 10)
    println(b < 3 && b < 10)
//not || -returns true if one statement is true
    println(b < 3 || b < 10)
//not ! returns the reverse
    println(!(b < 3))
    //comparison operators >, <, >=, <=, ==, !=
    var c=30
    var d=50
    println("is $c greater than $d? ${c>d}")
    println("is $c less than $d? ${c<d}")
    println("is $c equal to $d? ${c==d}")
    println("is $c greater than or equal to $d? ${c>=d}")
    println("is $c less than or equal to $d? ${c<=d}")
    println("is $c not equal to $d? ${c!=d}")
//null safety operators
    // ?,-safe call operators
 //?:elvis operators-provides a default value if the execution on the left is null
  //!! -not -null assertion-
}




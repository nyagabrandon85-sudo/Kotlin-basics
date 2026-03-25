fun main(){
    /*
    for loop-used to iterate through a collection:array, list
     */
    val students=listOf("Jack", "Mary", "Kamau", "Luke", "Damon", "Stephan", "Elena", "Calorine")
    println(students)
    //loop through a list
    for(x in students){
        println(x)
    }
    //looping through an array
    var fruits=arrayOf("Apple", "Pear", "Grapes", "Banana", "Pear")
    for(fruit in fruits){
        println(fruit)
    }
    //looping through range 2..8
    for(y in 2..8){
        println(y)
    }
    //loop through range e-j
    for(z in 'e'..'j'){
        println(z)
    }

}
data class User(val name: String, val age: Int, val email: String){
    fun ifo(){
        println("Username is $name and age is $age email is $email")
    }
}
fun main(){
    //create an object
    val user1=User(name="Lyon", age=19, email="lyon@gmail.com")
    println(user1)
    user1.ifo()
    //copy()
    val user2=user1.copy(name="Cate", email="Cate@gmail.com")
    println(user2)
    user2.ifo()
}
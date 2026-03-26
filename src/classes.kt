//a class is blueprint of creating objects
//object-is an instance os a class
//class-has properties and methods
class Person {
    //properties
    var name: String = ""
    var age: Int = 0
    var gender: String = ""

    //method
    fun dispaly_info() {
        println("Name is $name and age is $age Gender is $gender")
    }
}
    fun main() {
        //create an object
        val person1 = Person()
        person1.name = "Nixon"
        person1.gender = "Male"
        person1.age = 20
        //call the display info
        person1.dispaly_info()
        //create another object
        val person2 = Person()
        person2.name = "Lucy"
        person2.gender = "Female"
        person2.age = 17
        person2.dispaly_info()
        //create another object
        //create a car class

    }

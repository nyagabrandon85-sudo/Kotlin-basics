class Student(val name: String, val age: Int, var course: String){
    fun info(){
        println("Student's name is $name and age is $age, course:$course")
    }
}
fun main(){
    //create an object
    val student1=Student(name="Kikie", age=19, course="Medicine")
    student1.info()
    //create another object
    val student2=Student(name="Joshua", age=19, course="MIT")
    student2.info()
